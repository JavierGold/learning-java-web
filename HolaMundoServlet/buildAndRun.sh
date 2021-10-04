#!/bin/sh
mvn clean package && docker build -t mx.com.delasalle/HolaMundoServlet .
docker rm -f HolaMundoServlet || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServlet mx.com.delasalle/HolaMundoServlet