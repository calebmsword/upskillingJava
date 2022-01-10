package com.revature.beans;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    int id;
    String firstname;
    String lastname;
    int dept;
}
