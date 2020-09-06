package com.bitqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * spring mvc 测试文件上传
 * @author echo lovely
 * @date 2020/9/5 9:21
 */
@Controller
public class FileUploadDemo {

    @RequestMapping(value = "/fileUpload1")
    @ResponseBody
    public void upload1(String name, MultipartFile fileUpload) {

        System.out.println(name);
        System.out.println(fileUpload);

        String originalFilename = fileUpload.getOriginalFilename();
        try {
            // 将文件保存到文件夹
            //fileUpload.transferTo(new File("f://Temp//" + originalFilename));
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
            fileUpload.transferTo(new File("f://Temp//" + UUID.randomUUID() + ext));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 多文件上传..
    @RequestMapping(value = "/fileUpload2")
    @ResponseBody
    public void uploadFile2(MultipartFile[] uploadFiles) {

        String path = "f://temp//";
        File file = new File(path);
        // 文件夹不存在创建temp文件夹
        if (!file.exists())
            file.mkdirs();

        if (uploadFiles != null) {
            for (MultipartFile uploadFile : uploadFiles) {
                String originalFilename = uploadFile.getOriginalFilename();
                System.out.println("源文件名：" + originalFilename);

                // uuid + 文件后缀名
                String fileName = UUID.randomUUID() +
                        originalFilename.substring(originalFilename.lastIndexOf("."));

                try {
                    // 上传文件到指定目录
                    uploadFile.transferTo(new File(path + fileName));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
