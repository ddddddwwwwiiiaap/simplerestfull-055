/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
  * package ws.b.project04; //berfungsi untuk mengimport package yang ada di dalam project
@author dwiap //author dwiap

public class Product { //berfungsi untuk membuat class dengan nama Product
    
    private String id; //berfungsi untuk membuat id dengan tipe data String
    private String name; //berfungsi untuk membuat name dengan tipe data String

    public String getId() {  //berfungsi untuk membuat method getId
        return id; //berfungsi untuk mengembalikan nilai id
    } //berfungsi untuk menutup method getId

    public void setId(String id) { //berfungsi untuk membuat method setId
        this.id = id; //berfungsi untuk mengisi nilai id
    } //berfungsi untuk menutup method setId
    
    public String getName() { //berfungsi untuk membuat method getName
        return name; //berfungsi untuk mengembalikan nilai name
    } //berfungsi untuk menutup method getName

    public void setName(String name) { //berfungsi untuk membuat method setName
        this.name = name; //berfungsi untuk mengisi nilai name
    } //berfungsi untuk menutup method setName
    
} //berfungsi untuk menutup class Product

  */
package ws.b.project04; //berfungsi untuk mengimport package yang ada di dalam project

/**
 *
 * @author dwiap //author dwiap
 */
public class Product { //berfungsi untuk membuat class dengan nama Product
    
    private String id; //berfungsi untuk membuat id dengan tipe data String
    private String name; //berfungsi untuk membuat name dengan tipe data String
    private int price; //berfungsi untuk membuat name dengan tipe data int
    private int number; //berfungsi untuk membuat name dengan tipe data int
    private int total; //berfungsi untuk membuat name dengan tipe data int

    public String getId() {  //berfungsi untuk membuat method getId
        return id; //berfungsi untuk mengembalikan nilai id
    } //berfungsi untuk menutup method getId

    public void setId(String id) { //berfungsi untuk membuat method setId
        this.id = id; //berfungsi untuk mengisi nilai id
    } //berfungsi untuk menutup method setId
    
    public String getName() { //berfungsi untuk membuat method getName
        return name; //berfungsi untuk mengembalikan nilai name
    } //berfungsi untuk menutup method getName

    public void setName(String name) { //berfungsi untuk membuat method setName
        this.name = name; //berfungsi untuk mengisi nilai name
    } //berfungsi untuk menutup method setName

    public int getPrice() { //berfungsi untuk membuat method getPrice
        return price; //berfungsi untuk mengembalikan nilai price
    }

    public void setPrice(int price) { //berfungsi untuk membuat method setPrice
        this.price = price; //berfungsi untuk mengisi nilai price
    }
    
    public int getNumber() { //berfungsi untuk membuat method getNumber
        return number; //berfungsi untuk mengembalikan nilai number
    }

    public void setNumber(int number) { //berfungsi untuk membuat method setNumber
        this.number = number; //berfungsi untuk mengisi nilai number
    }

    public int getTotal() { //berfungsi untuk membuat method getTotal
        return price * number; //berfungsi untuk mengembalikan nilai total
    }
    
    public void setTotal(int total) { //berfungsi untuk membuat method setTotal
        this.total = total; //berfungsi untuk mengisi nilai total
    }
    
} //berfungsi untuk menutup class Product
