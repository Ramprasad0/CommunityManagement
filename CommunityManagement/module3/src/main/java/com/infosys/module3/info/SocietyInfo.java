package com.infosys.module3.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocietyInfo {
    private Long societyId;
    private String name;
    private String phoneNo;
    private String societyName;
    private String societyAddress;
    private String city;
    private String district;
    private String postal;
    private String email;
}