package com.bhupendrawork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookMethod {
    public List<Contacts> findAll() throws SQLException {
        List<Contacts> contacts = new ArrayList<>();

        Connection con = null;
        PreparedStatement preparedStatement = null;


        try {
            //step1: load and register Driver class
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //step2:Establish sql connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user= root & password = 121993");

            //step3: create statement
            String query = "Select * from addressbook.address_book";

            preparedStatement=con.prepareStatement(query);

            //step4:Execute Query

            ResultSet set=preparedStatement.executeQuery();

            while (set.next()){
                Contacts detail=new Contacts();

                int id=set.getInt(1);
                detail.setContact_Id(id);


                String firstname=set.getString(2);
                detail.setFirstName(firstname);

                String lastname=set.getString(3);
                detail.setLastName(lastname);

                String address=set.getString(4);
                detail.setAddress(address);

                String city=set.getString(5);
                detail.setCity(city);

                String state=set.getString(6);
                detail.getState(state);

                String zip=set.getString(7);
                detail.setZipCode(zip);

                String phone=set.getString(7);
                detail.setPhoneNumber(phone);

                String emailId=set.getString(8);
                detail.setEmailId(emailId);


                contacts.add(detail);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con !=null){
                con.close();
            }
            if (preparedStatement !=null){
                preparedStatement.close();
            }
        }return contacts;
    }
}