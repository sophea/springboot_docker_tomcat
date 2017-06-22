
Make sure you have install docker in your local environment :

https://docs.docker.com/engine/installation/


## docker commands :

Start dockerd with sudo dockerd -H unix:///var/run/docker.sock -H tcp://0.0.0.0:2375

## build maven with docker

mvn clean package docker:build


## startup comtat webapp

docker run --rm --name dockerwar -p 8080:8080  sopheamak/springboot_docker_tomcat

##go and see inside docker container 

>> docker exec -it dockerwar sh

##stop docker

docker stop dockerwar  


## To push the image you just built to the registry, specify the pushImage flag.

mvn clean package docker:build -DpushImage


## check docker logs

docker logs dockerwar


more about docker plugin with maven : https://github.com/spotify/docker-maven-plugin#authentication



## Docker-compose

To run this you need to install docker-compose first

>>cd target/docker

>>docker-compose up -d
