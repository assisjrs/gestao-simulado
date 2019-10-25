# gestao-simulado
Projeto de exemplo para gestão de simulados

Caso use linux certifque-se que o arquivo gradlew possui permissão de execução:
$ chmod +x ./gradlew

Para executar os testes:
$ ./gradlew test

Para executar a aplicação local certifique-se de ter o java 8 instalado corretamente:
$ ./gradelw build bootRun

Você também pode executar via Docker:
$ ./gradelw clean build jar

$ docker build -t gestao-sumulado:latest .
$ docker run -d -p 8080:8080/tcp --name simulado gestao-sumulado
