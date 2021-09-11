package com.lophiester.dsvendas.dto;

import com.lophiester.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable {
    private Long id;
    private String name;

   public SellerDTO(Seller entity){
       id=entity.getId();
       name= entity.getName();
   }

}
