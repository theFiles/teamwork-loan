package com.team.loanuser.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class MailUtil {
    /**
     * 发邮件类
     */
    @Resource
    private JavaMailSenderImpl mailSender;

    /**
     * 读取配置中的发送方邮箱
     */
    @Value("${spring.mail.username}")
    private String from;

    /**
     * 发送邮件
     * @param toMail        接收方email
     * @param subject       邮件标题
     * @param content       邮件内容
     * @return              是否成功发送
     */
    public boolean send(String toMail, String subject, String content) {
        // 邮件配置类
        SimpleMailMessage message = new SimpleMailMessage();
        // 发件方邮箱
        message.setFrom(from);
        // 收件方邮箱
        message.setTo(toMail);
        // 邮件标题
        message.setSubject(subject);
        // 邮件内容
        message.setText(content);

        try {
            mailSender.send(message);
            // 发送成功
            return true;
        }catch (Exception e) {
            // 发送失败
            // e.printStackTrace();
            return false;
        }
    }
}
