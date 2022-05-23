set CLASSPATH=Z:\home\server\bin;Z:\home\interface\compute.jar
java -cp Z:\home\server\bin;Z:\home\interface\compute.jar -Djava.rmi.server.codebase=file:/Z:/home/client/bin/ -Djava.rmi.server.hostname="192.168.72.62" -Djava.security.policy=Z:\home\server.policy engine/ComputeEngine
