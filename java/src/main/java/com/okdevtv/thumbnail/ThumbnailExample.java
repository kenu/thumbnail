package com.okdevtv.thumbnail;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

public class ThumbnailExample {
    public static void main(String[] args) {
        String input = "images/dog.png";
        String output = "images/output/dog.jthumb.jpg";
        getThumbnail(input, output);
    }

    public static void getThumbnail(String input, String output) {
        try {
            // 원본 이미지 파일
            File originalImage = new File(input);

            // 새로운 이미지 파일로 저장할 경로와 파일 이름
            File resizedImage = new File(output);

            Thumbnails.of(originalImage)
                .size(100, 100)
                .toFile(resizedImage);

            System.out.println("이미지 리사이즈가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
