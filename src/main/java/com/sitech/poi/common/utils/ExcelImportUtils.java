package com.sitech.poi.common.utils;

public class ExcelImportUtils {
	// @�������Ƿ���2003��excel������true��2003   
    public static boolean isExcel2003(String filePath)  {    
        return filePath.matches("^.+\\.(?i)(xls)$");    
    }    
     
    //@�������Ƿ���2007��excel������true��2007   
    public static boolean isExcel2007(String filePath)  {    
        return filePath.matches("^.+\\.(?i)(xlsx)$");    
    }    
      
  /** 
   * ��֤EXCEL�ļ� 
   * @param filePath 
   * @return 
   */  
  public static boolean validateExcel(String filePath){  
        if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath))){    
            return false;    
        }    
        return true;  
  }  
}
