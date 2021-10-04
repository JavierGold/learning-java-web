@echo off
call mvn clean package
call docker build -t mx.com.delasalle/HolaMundoServlet .
call docker rm -f HolaMundoServlet
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoServlet mx.com.delasalle/HolaMundoServlet