# letcode_training
This is repository to letcode training

=====================================================================================
## Day4 : Binary Search Algorithm

### Solution 1 : Tìm phần tử target được tìm thấy đầu tiên và phần tử target được tìm thấy cuối cùng trong mảng đã được sắp xếp bằng thuật toán tìm kiếm nhị phân

#### Output : 
Mảng result gồm 2 phần tử : result {result[0] , result[1]}
#### Hàm sử dụng bổ trợ : binarySearch với tham số đầu vào:
* Mảng nums
* Phần tử cần tìm target
* Phần tử nhỏ nhất low
* Phần tử lớn nhất high
#### Giải thuật:
* Step 1 :
   * Tìm phần tử target trong mảng nums bằng thuật toán tìm kiếm nhị phân - gán vào phần tử index
* Step 2 :
   * Nếu tìm thấy index ở step 1 , ta tiếp tục tìm result[0] và result[1]
   * gán left , right bằng index tìm được ở step 1 để làm mốc cho lần binarySearch tiếp theo
* Step 3 :
  * Tìm result[0] bằng thuật toán tìm kiếm nhị phân ở phần mảng phía bên trái của index tìm được ở bước 1
  * Tìm result[1] bằng thuật toán tìm kiếm nhị phân ở phần mảng bên phải của phần tử index tìm được ở bước 1
* Step 4 :
  * Đưa ra output hợp lí cho từng trường hợp
