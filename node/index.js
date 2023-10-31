const imageThumbnail = require("image-thumbnail");
const fs = require("fs");
const sharp = require("sharp");

getThumbnail();

async function getThumbnail() {
  try {
    const thumbnail = await imageThumbnail("images/dog.png");
    console.log(thumbnail);
    fs.writeFileSync("output/dog.thumb.jpg", thumbnail);
    // 썸네일을 WebP 형식으로 저장
    sharp(thumbnail)
      .toFormat("webp")
      .toFile("output/dog.thumb.webp", (err) => {
        if (err) {
          console.error(err);
        } else {
          console.log(
            "썸네일이 WebP 형식으로 생성되었고 'dog.thumb.webp' 파일에 저장되었습니다."
          );
        }
      });
  } catch (err) {
    console.error(err);
  }
}
