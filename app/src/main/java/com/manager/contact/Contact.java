package com.manager.contact;

/**
 * Created by JiraNott on 6/1/2558.
 */
public class Contact {

    private  String _name , _phone , _email , _address;
    //test
    public Contact(String name , String phone , String email , String address){
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
    }

    public String getName(){
        return _name;
    }

    public String getPhone(){
        return _phone;
    }

    public String getEmail(){
        return _email;
    }

    public String getAddress(){
        return _address;
    }
}
