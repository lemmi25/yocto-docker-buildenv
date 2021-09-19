How To Run Docker for Yocto Build
=================================

Conf Folder holds layer information that can be modified of use and will be copied to the docker image.

In currenrt direcotry build the image:

```
$ docker build --tag test .
```

Start the container 

´´´
$ docker run -itd test:latest 
´´´

Jump into container with shell

´´´
$ docker exec -it <mycontainer> bash
´´´

# Usefull commands to copy from container to local machine
```
docker cp <container>:<src-path> <local-dest-path> 
docker cp <src-path> <container>:<dest-path> 
```

