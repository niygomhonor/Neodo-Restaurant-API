package models.dao;

import models.Foodtype;
import models.Restaurant;

import java.util.BitSet;
import java.util.List;

public interface RestaurantDao {

    //create
    void add(Restaurant restaurant);
     void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype);

    //read
    List<Restaurant> getAll();
    Restaurant findById(int id);

    void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype);

    List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId);

    List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId);

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    //delete
    void deleteById(int id);
    void clearAll();

    BitSet Restaurant(int restaurantId);
}