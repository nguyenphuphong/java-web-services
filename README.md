# Web Services

Môn này chúng ta sẻ làm quen với 2 webserivces thịnh hành nhất hiện nay đó là SOAP và RESTful

Về ngữ cảnh của bài tập này, chúng ta muốn xây dựng một hệ thống có tên LEADER, đây là một hệ thống
webservices cho phép người dùng có thể tương tác với hệ thống thông qua SOAP và REST. Về cơ bản
chúng ta hãy xem LEADER là một hệ thống quản lí các thông tin quảng cáo du học. Các hệ thống khác
sẻ liên kết với LEADER để đăng tải các thông tin du học. 

## Bài tập 1

Bài này chúng ta sẻ làm quen với việc sử dụng SOAP. Yêu cầu của bài toán đặt ra là xây dựng một số các
SOAP method để phục vụ cho nhu cầu sau:

- Truy vấn một danh sách các tiêu đề (title) của thông tin du học (information) dạng phân trang (paging).
Ví dụ lấy 10 tiêu đề của (information) từ vị trí thứ 50.
- Truy vấn thông tin chi tiết (description) của 1 thông tin du học (information) thông qua (id)

Tiếp theo, chúng ta sẻ chỉnh sửa hệ thống SENIOR để có thể tương tác được với các SOAP methods và hiển thị
các thông tin tương ứng.

## Bài tập 2

Bài này chúng ta sẻ làm quye với việc sử dụng REST. Yêu cầu của bài toán đặt ra là xây dựng một số các
RESTful API để phục vụ cho nhu cầu sau:

- Truy vẫn các (information) theo (title).
- Chúng ta sẻ tạo ra một bảng khác tên là (tb_application) để lưu các thông tin đăng kí cho một thông
tin du học nào đấy. Sau đó hãy tạo ra các API tương ứng để có thể (insert, delete, update) một application

Tiếp theo, chúng ta sẻ chỉnh sửa hệ thống SENIOR để có thể tương tác được với các Rest APIs vừa tạo ra.
Cần tạo ra các page, và gọi các API để thực hiện các tính năng trên page này.

