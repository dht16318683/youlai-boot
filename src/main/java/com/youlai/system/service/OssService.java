package com.youlai.system.service;

import com.youlai.system.model.dto.FileInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件接口
 * <p>
 * 已实现 MinIO
 *
 * @author haoxr
 * @since 2022/11/19
 */
public interface OssService {

    /**
     * 上传文件
     * @param file 表单文件对象
     * @return
     */
    FileInfo uploadFile(MultipartFile file);

    /**
     * 删除文件
     *
     * @param filePath
     * @return
     */
    boolean deleteFile(String filePath);


}