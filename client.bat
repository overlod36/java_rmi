set CLASSPATH=E:\5\client\bin;Z:\home\interface\compute.jar
java -cp E:\5\client\bin;Z:\home\interface\compute.jar -Djava.rmi.server.codebase=file:/Z:/home/client/bin/ -Djava.security.policy=E:\5\client.policy client/ComputeAlgo localhost 1 -3 5 -4 7
pause