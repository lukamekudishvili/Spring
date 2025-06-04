package com.luka.aopdemo;

import com.luka.aopdemo.DAO.AccountDAO;
import com.luka.aopdemo.DAO.MembershipDAO;
import com.luka.aopdemo.DAO.MembershipDAOImpl;
import com.luka.aopdemo.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(AopdemoApplication.class, args);


    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        return runner -> {

            demoTheBeforeAdvice(accountDAO, membershipDAO);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        Account account=new Account("Luka", "Level2");
        accountDAO.addAccount(account, true);
        System.out.println();

        membershipDAO.addAccount();
        System.out.println();

        accountDAO.addPost();
        System.out.println();


    }

}
