package br.com.example.controller;

import br.com.example.broker.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
@Slf4j
public class KafkaController {
    private final TopicProducer topicProducer;

    @PostMapping(value = "/send/credit_approval")
    public String send_credit_approval(@RequestBody String body) {
        topicProducer.send_credit_approval(body);
        return "Success";
    }

    @PostMapping(value = "/send/credit_approval_cancel")
    public String send_credit_approval_cancel(@RequestBody String body) {
        topicProducer.send_credit_approval_cancel(body);
        return "Success";
    }

    @PostMapping(value = "/send/credit_approval_rtre")
    public String send_credit_approval_rtre(@RequestBody String body) {
        topicProducer.send_credit_approval_rtre(body);
        return "Success";
    }

    @PostMapping(value = "/send/kyc")
    public String send_kyc(@RequestBody String body) {
        topicProducer.send_kyc(body);
        return "Success";
    }

    @PostMapping(value = "/send/pooling_order")
    public String send_pooling_order(@RequestBody String body) {
        topicProducer.send_pooling_order(body);
        return "Success";
    }

    @PostMapping(value = "/send/reguler_survey")
    public String send_reguler_survey(@RequestBody String body) {
        topicProducer.send_reguler_survey(body);
        return "Success";
    }

    @PostMapping(value = "/send/result_credit_approval_rtre")
    public String send_result_credit_approval_rtre(@RequestBody String body) {
        topicProducer.send_result_credit_approval_rtre(body);
        return "Success";
    }

    @PostMapping(value = "/send/screening_satu")
    public String send_screening_satu(@RequestBody String body) {
        topicProducer.send_screening_satu(body);
        return "Success";
    }

    @PostMapping(value = "/send/tele_survey")
    public String send_tele_survey(@RequestBody String body) {
        topicProducer.send_tele_survey(body);
        return "Success";
    }

    @PostMapping(value = "/send/screening_dua")
    public String send_screening_dua(@RequestBody String body) {
        topicProducer.send_screening_dua(body);
        return "Success";
    }

    @PostMapping(value = "/send/result_pre_ppd")
    public String send_result_pre_ppd(@RequestBody String body) {
        topicProducer.send_result_pre_ppd(body);
        return "Success";
    }

    @PostMapping(value = "/send/screening_tiga")
    public String send_screening_tiga(@RequestBody String body) {
        topicProducer.send_screening_tiga(body);
        return "Success";
    }

    @PostMapping(value = "/send/return_pooling")
    public String send_return_pooling(@RequestBody String body) {
        topicProducer.send_return_pooling(body);
        return "Success";
    }

    @PostMapping(value = "/send/silent_survey")
    public String send_silent_survey(@RequestBody String body) {
        topicProducer.send_silent_survey(body);
        return "Success";
    }

    @PostMapping(value = "/send/submit_approval_brms")
    public String send_submit_approval_brms(@RequestBody String body) {
        topicProducer.send_submit_approval_brms(body);
        return "Success";
    }

    @PostMapping(value = "/send/overtime_process")
    public String send_overtime_process(@RequestBody String body) {
        topicProducer.send_overtime_process(body);
        return "Success";
    }

    @PostMapping(value = "/send/entry_manual_2")
    public String send_entrymanual2(@RequestBody String body) {
        topicProducer.send_entrymanual2(body);
        return "Success";
    }

    @PostMapping(value = "/send/confirm_docver")
    public String send_confirm_docver(@RequestBody String body) {
        topicProducer.send_confirm_docver(body);
        return "Success";
    }

    @PostMapping(value = "/send/efm")
    public String send_efm(@RequestBody String body) {
        topicProducer.send_efm(body);
        return "Success";
    }

    @PostMapping(value = "/send/efd")
    public String send_efd(@RequestBody String body) {
        topicProducer.send_efd(body);
        return "Success";
    }

    @PostMapping(value = "/send/cancel_todolist")
    public String send_cancel_todolist(@RequestBody String body) {
        topicProducer.send_cancel_todolist(body);
        return "Success";
    }

    @PostMapping(value = "/send/return_request_approve")
    public String send_return_request_approve(@RequestBody String body) {
        topicProducer.send_return_request_approve(body);
        return "Success";
    }

    @PostMapping(value = "/send/result_ppd_livin")
    public String send_result_ppd_livin(@RequestBody String body) {
        topicProducer.send_result_ppd_livin(body);
        return "Success";
    }

    @PostMapping(value = "/send/credit_approval_cancel_po_cl")
    public String send_credit_approval_cancel_po_cl(@RequestBody String body) {
        topicProducer.send_credit_approval_cancel_po_cl(body);
        return "Success";
    }

    @PostMapping(value = "/send/result_po_cl")
    public String send_result_po_cl(@RequestBody String body) {
        log.info("MASOK RESULT POCEL");
        topicProducer.send_result_po_cl(body);
        return "Success";
    }
}
