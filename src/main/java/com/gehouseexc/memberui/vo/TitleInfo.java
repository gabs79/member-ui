package com.gehouseexc.memberui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitleInfo {
    
    private Long congressNum;
    private String congressText;
    private String session;
    private String majority;
    private String minority;
    private String clerk;
    private String weburl;
}
