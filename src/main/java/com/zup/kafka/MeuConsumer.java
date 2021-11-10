package com.zup.kafka;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class MeuConsumer {


    //Mo properties, aí embaixo
    @KafkaListener(topics = "${spring.kafka.topic.transactions}",
            groupId = "${spring.kafka.consumer.group-id}",
            properties = {"spring.json.value.default.type=com.zup.kafka.Teste"})
    public void ouvir(ConsumerRecord<String, Teste> record)
    {
        System.out.println(record.value());;
    }

}
