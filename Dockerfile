FROM ubuntu:20.04

ARG DEBIAN_FRONTEND=noninteractive      
                                                                                 
# Upgrade system and Yocto Proyect basic dependencies                            
RUN apt-get update && apt-get -y upgrade && apt-get -y install htop nano vim tree bash gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat cpio python python3 python3-pip python3-pexpect xz-utils debianutils iputils-ping libsdl1.2-dev xterm curl 
                                                                                 
# Set up locales                                                                 
RUN apt-get -y install locales apt-utils sudo && dpkg-reconfigure locales && locale-gen en_US.UTF-8 && update-locale LC_ALL=en_US.UTF-8 LANG=en_US.UTF-8 
ENV LANG en_US.utf8                                                              
                                                                                 
# Clean up APT when done.                                                        
RUN apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*  
                                                                         
# Replace dash with bash                                                         
RUN rm /bin/sh && ln -s bash /bin/sh                                        
                                                                                 
# User management                                                                
RUN groupadd -g 1000 build && useradd -u 1000 -g 1000 -ms /bin/bash build && usermod -a -G sudo build && usermod -a -G users build 
                                                                                 
# Run as build user from the installation path                                   
ENV YOCTO_INSTALL_PATH "/opt/yocto"                                              
RUN install -o 1000 -g 1000 -d $YOCTO_INSTALL_PATH                               
USER build                                                                       
WORKDIR ${YOCTO_INSTALL_PATH}   
                                                                                 
# Set the Yocto release                                                          
ENV YOCTO_RELEASE "dunfell"                                                         
                                                                                 
# Install Poky                                                                   
RUN git clone --branch ${YOCTO_RELEASE} git://git.yoctoproject.org/poky          
RUN git clone --branch ${YOCTO_RELEASE} https://github.com/openembedded/meta-openembedded.git       
RUN git clone --branch ${YOCTO_RELEASE} https://github.com/agherzan/meta-raspberrypi.git
RUN git clone --branch ${YOCTO_RELEASE} https://github.com/rauc/meta-rauc.git
RUN git clone --branch ${YOCTO_RELEASE} https://github.com/leon-anavi/meta-rauc-community.git

RUN source poky/oe-init-build-env /home/build

ADD ./conf $HOME/home/build/conf
ADD ./custom-layer $HOME/home/custom-layer

USER root
RUN chown build:build /home/custom-layer/*
RUN chown build:build /home/build/conf/*
USER build

# Make /home/build the working directory                                         
WORKDIR /home/build 

