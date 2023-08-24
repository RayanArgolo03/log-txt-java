/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domain.Log;
import domain.User;
import java.time.LocalDateTime;

/**
 *
 * @author Acer
 */
public class LogService {
    
    public Log createLog(User user){
         return new Log(user.getName(), LocalDateTime.now());
    }
    
}
