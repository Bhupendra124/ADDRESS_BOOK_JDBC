package com.bhupendrawork;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    static final Scanner s=new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        System.out.println("Press1 to Retrive data\n");

        int choice=s.nextInt();
        switch (choice){
            case 1:RetriveData();
            break;
        }
    }

    private static void RetriveData() throws SQLException {
    AddressBookMethod address=new AddressBookMethod();
        List<Contacts> contacts=address.findAll();
        contacts.forEach(System.out::println);
    }
}
