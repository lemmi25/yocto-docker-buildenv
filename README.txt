How To Run Docker for Yocto Build
=================================

In currenrt direcotry run:

```
$ docker build
```

We have to store under /tmp to comply with Apples filesystem
```
$ sudo install -o 1000 -g 1000 -d /tmp/yocto
$ cd /tmp/yocto
$ docker run -it --rm -v $PWD:/home/build yocto
```

# Usefull commands 
```
docker exec -it <mycontainer> bash
```

