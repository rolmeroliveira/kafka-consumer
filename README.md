# Kafka consumer

### Este repo contem um consumidor de mensagens do Kafa, com o mínimo de configurações possível!
### Para testar este consumer, criamos um outro repo, cujo enderço encontra-se ao final do texto
### No outro repo vc encontra o produtor de mensagens e o arquivo compose para subir o broker

Como espera-se que este producer seja testado na mesma máquina que o consumer, 
sugerimos verificar a definção da porta no arquivo application.yml. 

O producer pode ficar na porta padãro (8080 - não precisa definir explicitamente), enquanto o consumer
deve rodar em outra porta (talvez 8081 - neste caso a definição é obrigatória)


[Aqui você encontra o producer de msgs e o compose para subir o broker!](https://github.com/rolmeroliveira/kafka-broker-e-producer)