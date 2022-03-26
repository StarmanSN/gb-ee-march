package ru.gb.homework;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private int id;
    private String title;
    private int cost;

}
