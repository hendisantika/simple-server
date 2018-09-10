# Simple Server


After creating the runnable springboot app via `mvn clean package`, I start five instances, running in background on different ports:

```
nohup java -jar simpleserver-0.0.1-SNAPSHOT.jar --server.port=8081 --shell.ssh.port=10081 &
nohup java -jar simpleserver-0.0.1-SNAPSHOT.jar --server.port=8082 --shell.ssh.port=10082 &
nohup java -jar simpleserver-0.0.1-SNAPSHOT.jar --server.port=8083 --shell.ssh.port=10083 &
nohup java -jar simpleserver-0.0.1-SNAPSHOT.jar --server.port=8084 --shell.ssh.port=10084 &
nohup java -jar simpleserver-0.0.1-SNAPSHOT.jar --server.port=8085 --shell.ssh.port=10085 &
```

For further load testing you could use `ab` in the following way: `ab -n 200000 -c 5 http://localhost:8080/`

ps -ef | grep simple-server

I try this repo refer to this [article](http://christoph-burmeister.eu/?p=2951)