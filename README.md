* Bản note chỉ mới ghi cách hiểu sơ lược, trong các lần sau sẽ tổng hợp các yêu cầu và những thứ cần có đủ để ứng dụng chúng vào thực tế

  Đọc thêm: https://github.com/doctor-blue/design-patterns/tree/master  
  Xem thêm: https://youtube.com/design-pattern  
  Tài liệu tham khảo: https://refactoring.guru/design-patterns

Nhóm Creational:
-	Singleton Pattern: Về lý thuyết Singleton đảm bảo việc chỉ được sử dụng một đối tượng duy nhất để xử lý một công việc nào đó. Trong trường hợp các luồng đều cùng gọi nó ta phải thực hiện đồng bộ
Đọc thêm: https://viblo.asia/p/singleton-pattern
![alt text](https://github.com/kien091/design-pattern/blob/master/Image/singleton.png?raw=true)
Hình 1: Structure of Singleton

-	Factory Pattern: Về cơ bản Factory như là đầu ra trả về kết quả khi đưa vào input cho nó. Nó như một nhà máy thực sự. Khi bạn đưa cho nó nguyên liệu thì nó sẽ đưa ra kết quả cho bạn.
Đọc thêm: https://viblo.asia/p/factory-pattern-part1
Đọc thêm: https://viblo.asia/p/factory-pattern-part2
 
Hình 2: Structure of Factory

-	Abstract Factory Pattern: Về cơ bản nó như là một nhà máy bao gồm các nhà máy khác. Trong trường hợp các đối tượng cùng loại có các tính chất tương tự nhau và chúng có thể có nhiều hơn 2 thuộc tính (trong ví dụ là 2 vd như nội thất và loại màu)
Đọc thêm: https://viblo.asia/p/abstract-factory-pattern
 
Hình 3: Structure of Abstract-Factory

-	Builder Pattern: Về cơ bản nó thường được ứng dụng trong việc liên quan đến tạo nhiều constructor trong code. Trong trường hợp 1 constructor đủ đối số nhưng có nhiều trong số đó nhiều lúc không thực sự cần thiết ta thường để null hoặc tạo một hàm constructor mới không có nó. Nhưng như vậy sẽ không tối ưu và thường rất khó khăn trong việc xác định vị trí của các đối số → Builder Pattern
Ps: Thay vì dùng trực tiếp constructor từ class muốn tạo ta dùng luôn builder được xử lý theo class đó
Đọc thêm: https://viblo.asia/p/builder-pattern
 
Hình 4: Structure of Builder

-	Prototype Pattern: Về cơ bản nó tạo mới đối tượng qua một đối tượng đã có sẵn trước đó.Giúp tiết kiệm thời gian và chi phí khi khởi tạo đối tượng. Một object hỗ trợ sao chép được gọi là prototype. Thường clone có 2 kiểu là shallow copy (tạo mới nhưng value đang reference tới đối tượng cũ) và deep copy (tạo mới, reference đối tượng mới)
Đọc thêm: https://viblo.asia/p/prototype-pattern
 
Hình 5: Structure of Prototype 
Nhóm Structural:
-	Adapter Pattern: Là một lớp trung gian lắp ráp giữa hai lớp khác nhau để chúng có thể hoạt động được với nhau. Sử dụng khi muốn sử dụng một số class có sẵn nhưng interface không tương thích với code hiện tại hoặc thêm một số chức năng vào subclass đã có sẵn. Gồm 2 loại là Object Adapter và Class Adapter
Đọc thêm: https://viblo.asia/p/adapter-pattern-theory
Đọc thêm: https://viblo.asia/p/adapter-pattern
 
Hình 6: Structure of Adapter

-	Bridge Pattern: Tách tính trừu (abstract) tượng ra khỏi tính hiện thực (implementation) của nó từ đó dễ dàng chỉnh sửa và thay thế. (ps: như cây cầu với 2 bên cầu là 2 dạng trừu tượng và hiện thực của nó). Ta dùng khi cả 2 dễ dàng mở rộng độc lập với nhau, cả 2 cũng nên được mở rộng bằng subclass
Đọc thêm: https://viblo.asia/p/bridge-pattern
Đọc thêm: https://viblo.asia/p/bridge-pattern-2
 
Hình 7: Structure of Bridge

-	Composite Pattern: Là gộp các đối tượng lại với nhau để tạo ra thành phần lớn hơn. Được sử dụng khi chúng ta cần xử lý một nhóm đối tượng tương tự như khi xử lý một object. Được sắp xếp theo cấu trúc cây (nó thường dạng được phân cấp vd như các vị trí trong 1 công ty)
Đọc thêm: https://viblo.asia/p/composite-pattern
Đọc thêm: https://viblo.asia/p/composite-pattern-2
 
Hình 8: Structure of Composite

-	Decorator Pattern: Được sử dụng để mở rộng chức năng mà không làm thay đổi cấu trúc của nó
Đọc thêm: https://viblo.asia/p/decorator-pattern
Đọc thêm: https://viblo.asia/p/decorator-pattern-2
 
Hình 9: Structure of Decorator

-	Facade Pattern: Cung cấp một giao diện chung đơn giản thay cho một nhóm giao diện có trong một hệ thống con. Nó cho phép truy cập giao diện chung này để giao tiếp với các giao diện có trong hệ thống con.
Đọc thêm: https://viblo.asia/p/facade-pattern
Đọc thêm: https://viblo.asia/p/facade-pattern-2

 
Hình 10: Structure of Facade

-	Proxy Pattern: (Surrogate)Điều khiển gián tiếp truy xuất đối tượng thông qua một đối tượng được ủy nhiệm. Giải quyết các vấn đề security, performance, validation, …vv
Đọc thêm: https://viblo.asia/p/proxy-pattern
Đọc thêm: https://viblo.asia/p/proxy-pattern-2

Nhóm Behavior:
-	Iterator Pattern (Cursor): cho phép xử lý nhiều loại tập hợp khác nhau bằng cách truy cập những phần tử của tập hợp với cách thức, phương pháp định sẵn mà không cần phải hiểu rõ những chi tiết bên trong tập hợp 
Đọc thêm: https://viblo.asia/p/iterator-pattern
Đọc thêm: https://viblo.asia/p/iteraror-pattern-2

-	Stratery Pattern: tách rời phần xử lý chức năng cụ thể ra khỏi đối tượng. Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và chọn thuật toán phù hợp để xử lý. Thông thường việc tách như vậy là do việc thay vì override hay copy - viết lại các method đó với 1 đối tượng tương tự ta có thể thay thế nó bằng việc gom nó lại và viết phương thức cho nó.
Đọc thêm: https://viblo.asia/p/strategy-pattern
Đọc thêm: https://viblo.asia/p/strategy-pattern-2

 
