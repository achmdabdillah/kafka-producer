package br.com.example.broker.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    @Value("${topic.name.producer}")
    private String topicName;

    @Value("${topic.name.credit_approval}")
    private String credit_approval;

    @Value("${topic.name.credit_approval_cancel}")
    private String credit_approval_cancel;

    @Value("${topic.name.credit_approval_rtre}")
    private String credit_approval_rtre;

    @Value("${topic.name.kyc}")
    private String kyc;

    @Value("${topic.name.pooling_order}")
    private String pooling_order;

    @Value("${topic.name.reguler_survey}")
    private String reguler_survey;

    @Value("${topic.name.result_credit_approval_rtre}")
    private String result_credit_approval_rtre;

    @Value("${topic.name.screening_dua}")
    private String screening_dua;

    @Value("${topic.name.screening_tiga}")
    private String screening_tiga;

    @Value("${topic.name.return_pooling}")
    private String return_pooling;

    @Value("${topic.name.silent_survey}")
    private String silent_survey;

    @Value("${topic.name.submit_approval_brms}")
    private String submit_approval_brms;

    @Value("${topic.name.tele_survey}")
    private String tele_survey;

    @Value("${topic.name.efm}")
    private String efm;

    @Value("${topic.name.efd}")
    private String efd;
    
    @Value("${topic.name.return_request_approve}")
    private String return_request_approve;

    @Value("${topic.name.credit_approval_cancel_po_cl}")
    private String credit_approval_cancel_po_cl;

    @Value("${topic.name.result_po_cl}")
    private String result_po_cl;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send_credit_approval(String message) {
        kafkaTemplate.send(credit_approval, message);
    }

    public void send_credit_approval_cancel(String message) {
        kafkaTemplate.send(credit_approval_cancel, message);
    }

    public void send_credit_approval_rtre(String message) {
        kafkaTemplate.send(credit_approval_rtre, message);
    }

    public void send_kyc(String message) {
        kafkaTemplate.send(kyc, message);
    }

    public void send_pooling_order(String message) {
        kafkaTemplate.send(pooling_order, message);
    }

    public void send_reguler_survey(String message) {
        kafkaTemplate.send(reguler_survey, message);
    }

    public void send_result_credit_approval_rtre(String message) {
        kafkaTemplate.send(result_credit_approval_rtre, message);
    }

    public void send_screening_dua(String message) {
        kafkaTemplate.send(screening_dua, message);
    }

    public void send_screening_tiga(String message) {
        kafkaTemplate.send(screening_tiga, message);
    }

    public void send_return_pooling(String message) {
        kafkaTemplate.send(return_pooling, message);
    }

    public void send_silent_survey(String message) {
        kafkaTemplate.send(silent_survey, message);
    }

    public void send_submit_approval_brms(String message) {
        kafkaTemplate.send(submit_approval_brms, message);
    }

    public void send_tele_survey(String message) {
        kafkaTemplate.send(tele_survey, message);
    }

    public void send_efm(String message) {
        kafkaTemplate.send(efm, message);
    }

    public void send_efd(String message) {
        kafkaTemplate.send(efd, message);
    }
    public void send_return_request_approve(String message) {
        kafkaTemplate.send(return_request_approve, message);
    }

    public void send_credit_approval_cancel_po_cl(String message) {
        kafkaTemplate.send(credit_approval_cancel_po_cl, message);
    }
    
    public void send_result_po_cl(String message) {
        kafkaTemplate.send(result_po_cl, message);
    }

}