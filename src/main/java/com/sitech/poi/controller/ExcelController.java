package com.sitech.poi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sitech.poi.common.utils.ExcelImportUtils;
import com.sitech.poi.service.ExcelService;

@RestController
@RequestMapping("/excel")
public class ExcelController {
	@Autowired
	private ExcelService excelService;
	//����  
	@RequestMapping(value = "batchImport")  
	public String batchImportUserKnowledge(@RequestParam(value="filename") MultipartFile file,  
	        HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{  
	  
	    //�ж��ļ��Ƿ�Ϊ��  
	    if(file==null){  
	     session.setAttribute("msg","�ļ�����Ϊ�գ�");  
	     return "redirect:toUserKnowledgeImport";  
	    }  
	      
	    //��ȡ�ļ���  
	    String fileName=file.getOriginalFilename();  
	      
	    //��֤�ļ����Ƿ�ϸ�  
	    if(!ExcelImportUtils.validateExcel(fileName)){  
	     session.setAttribute("msg","�ļ�������excel��ʽ��");  
	     return "redirect:toUserKnowledgeImport";  
	    }  
	      
	    //��һ���ж��ļ������Ƿ�Ϊ�գ����ж����С�Ƿ�Ϊ0���������Ƿ�Ϊnull��  
	    long size=file.getSize();  
	    if(StringUtils.isEmpty(fileName) || size==0){  
	     session.setAttribute("msg","�ļ�����Ϊ�գ�");  
	     return "redirect:toUserKnowledgeImport";  
	    }  
	      
	    //��������  
	    String message = excelService.batchImport(fileName,file);  
	    session.setAttribute("msg",message);  
	    return "redirect:toUserKnowledgeImport";  
	}  
}
