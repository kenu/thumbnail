package com.okdevtv.thumbnail;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

public class ThumbnailExample {
    public static void main(String[] args) {
        try {
            // 원본 이미지 파일
            File originalImage = new File("images/dog.png");

            // 새로운 이미지 파일로 저장할 경로와 파일 이름
            File resizedImage = new File("images/output/dog.jthumb.jpg");

            // 이미지 리사이즈 (가로 200px, 세로 200px)
            Thumbnails.of(originalImage)
                .size(100, 100)
                .toFile(resizedImage);

            System.out.println("이미지 리사이즈가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
