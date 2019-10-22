# SOAP
Criação de um webService SOAP e consumindo o mesmo.

# CalculadoraServer
No projeto CalculadoraServer, basta startar o projeto pela classe main, com isso teremos acesso ao web service:
http://127.0.0.1:9876/calc?wsdl

# CalculadoraClient

No projeto CalculadoraClient temos que ter também a interface CalculadoraServer com os métodos (operações) que o server nos fornece, para fazermos as chamadas!

# Geral

Com o CalculadoraServer no ar, podemos rodar o CalculadoraClient e ele irá invocar todas as operações do CalculadoraServer e imprimir no console =)

![alt text](https://github.com/cesarschutz/SOAP/blob/master/Consumindo%20CalculadoraServer.png?raw=true)
