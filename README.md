How To Run Docker for Yocto Build
=================================

Conf Folder holds layer information that can be modified of use and will be copied to the docker image.

In currenrt direcotry build the image:

```
$ docker build --tag rpi_yocto .
```

Start the container 

```
$ docker run -itd rpi_yocto 
```

Jump into container with shell

```
$ docker exec -it <my container name> bash
```

Build 


Before you build make sure you copy pylon into your docker container
```
docker cp <location>/pylon_6.2.0.21487_aarch64_setup.tar.gz <my container name>:/home/build/downloads
```

```
$ source /opt/yocto/poky/oe-init-build-env /home/build
$ bitbake core-image-minimal
```

Usefull commands to copy from container to local machine

```
docker cp <container>:<src-path> <local-dest-path> 
docker cp <src-path> <container>:<dest-path> 
docker cp <container>:/home/build/tmp/deploy/images/raspberrypi3 /path of choice
docker ps
bitbake -s | grep ^python3 # find python packages that can be installed
systemctl --no-pager status hello
docker exec -it --user root <container-id> /bin/bash
```

