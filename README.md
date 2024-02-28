* Bản note chỉ mới ghi cách hiểu sơ lược, trong các lần sau sẽ tổng hợp các yêu cầu và những thứ cần có đủ để ứng dụng chúng vào thực tế

  Đọc thêm: [https://github.com/doctor-blue/design-patterns/tree/master  
  Xem thêm: [https://youtube.com/design-pattern](https://www.youtube.com/playlist?list=PLRoAKls-7kksSBqximU9CjBgCApQVDgmX)  
  Tài liệu tham khảo: https://refactoring.guru/design-patterns

## Nhóm Creational:
-	*Singleton Pattern*: Đảm bảo việc chỉ tạo ra một đối tượng xuyên suốt. Thực hiện công việc tuần tự với synchronous
  Đọc thêm: [https://viblo.asia/p/singleton-pattern](https://viblo.asia/p/singleton-design-pattern-tro-thu-dac-luc-cua-developers-Qbq5QBkJKD8)  
  Đọc thêm: [https://viblo.asia/p/singleton-pattern-2](https://viblo.asia/p/hoc-singleton-pattern-trong-5-phut-4P856goOKY3)
 	<p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/singleton.png?raw=true" />
    <p align="center">Hình 1: Structure of Singleton</p>
  </p>

-	*Factory Pattern*: Về cơ bản Factory như là đầu ra trả về kết quả khi đưa vào input cho nó. Nó như một nhà máy thực sự. Khi bạn đưa cho nó nguyên liệu thì nó sẽ đưa ra kết quả cho bạn.  
  Đọc thêm: [https://viblo.asia/p/factory-pattern-part1](https://viblo.asia/p/design-pattern-factory-pattern-part-1-XqaGEmxZGWK)  
 	Đọc thêm: [https://viblo.asia/p/factory-pattern-part2](https://viblo.asia/p/design-pattern-factory-pattern-part-2-XQZGxZqjkwA)  
 	<p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/factory.png?raw=true" />
    <p align="center">Hình 2: Structure of Factory</p>
  </p>

-	*Abstract Factory Pattern*: Về cơ bản nó như là một nhà máy bao gồm các nhà máy khác. Trong trường hợp các đối tượng cùng loại có các tính chất tương tự nhau và chúng có thể có nhiều hơn 2 thuộc tính (trong ví dụ là 2 vd như nội thất và loại màu)  
  Đọc thêm: [https://viblo.asia/p/abstract-factory-pattern](https://viblo.asia/p/abstract-factory-design-pattern-tro-thu-dac-luc-cua-developers-maGK7B4M5j2)  
  Đọc thêm: [https://viblo.asia/p/abstract-factory-pattern-2](https://viblo.asia/p/design-patterns-phan-3-tu-factory-method-den-abstract-factory-LzD5dMkzKjY)  
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/abstract-factory.png?raw=true" />
    <p align="center">Hình 3: Structure of Abstract-Factory</p>
  </p>

-	*Builder Pattern*: Về cơ bản nó thường được ứng dụng trong việc liên quan đến tạo nhiều constructor trong code. Trong trường hợp 1 constructor đủ đối số nhưng có nhiều trong số đó nhiều lúc không thực sự cần thiết ta thường để null hoặc tạo một hàm constructor mới không có nó. Nhưng như vậy sẽ không tối ưu và thường rất khó khăn trong việc xác định vị trí của các đối số → Builder Pattern  
Ps: Thay vì dùng trực tiếp constructor từ class muốn tạo ta dùng luôn builder được xử lý theo class đó  
  Đọc thêm: [https://viblo.asia/p/builder-pattern](https://viblo.asia/p/builder-design-pattern-6J3ZgjwgKmB)  
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/builder.png?raw=true" />
    <p align="center">Hình 4: Structure of Builder</p>
  </p>

-	*Prototype Pattern*: Về cơ bản nó tạo mới đối tượng qua một đối tượng đã có sẵn trước đó.Giúp tiết kiệm thời gian và chi phí khi khởi tạo đối tượng. Một object hỗ trợ sao chép được gọi là prototype. Thường clone có 2 kiểu là shallow copy (tạo mới nhưng value đang reference tới đối tượng cũ) và deep copy (tạo mới, reference đối tượng mới)<br>
  Đọc thêm: [https://viblo.asia/p/prototype-pattern](https://viblo.asia/p/prototype-design-pattern-tro-thu-dac-luc-cua-developers-GrLZDBQO5k0) 
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/prototype.png?raw=true" />
    <p align="center">Hình 5: Structure of Prototype</p>
  </p>

## Nhóm Structural:
-	*Adapter Pattern*: Là một lớp trung gian lắp ráp giữa hai lớp khác nhau để chúng có thể hoạt động được với nhau. Sử dụng khi muốn sử dụng một số class có sẵn nhưng interface không tương thích với code hiện tại hoặc thêm một số chức năng vào subclass đã có sẵn. Gồm 2 loại là Object Adapter và Class Adapter<br>
  Đọc thêm: [https://viblo.asia/p/adapter-pattern-theory](https://viblo.asia/p/adapter-design-pattern-tro-thu-dac-luc-cua-developers-Az45bqYQlxY)<br>
  Đọc thêm: [https://viblo.asia/p/adapter-pattern](https://viblo.asia/p/huong-dan-adapter-design-pattern-ORNZqd7bK0n)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/adapter.png?raw=true" />
    <p align="center">Hình 6: Structure of Adapter</p>
  </p>

-	*Bridge Pattern*: Tách tính trừu (abstract) tượng ra khỏi tính hiện thực (implementation) của nó từ đó dễ dàng chỉnh sửa và thay thế. (ps: như cây cầu với 2 bên cầu là 2 dạng trừu tượng và hiện thực của nó). Ta dùng khi cả 2 dễ dàng mở rộng độc lập với nhau, cả 2 cũng nên được mở rộng bằng subclass.<br>
  Đọc thêm: [https://viblo.asia/p/bridge-pattern](https://viblo.asia/p/bridge-design-pattern-tro-thu-dac-luc-cua-developers-gDVK2oG2ZLj)<br>
  Đọc thêm: [https://viblo.asia/p/bridge-pattern-2](https://viblo.asia/p/design-patterns-bridge-gDVK2rarKLj)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/bridge.png?raw=true" />
    <p align="center">Hình 7: Structure of Bridge</p>
  </p>

-	*Composite Pattern*: Là gộp các đối tượng lại với nhau để tạo ra thành phần lớn hơn. Được sử dụng khi chúng ta cần xử lý một nhóm đối tượng tương tự như khi xử lý một object. Được sắp xếp theo cấu trúc cây (nó thường dạng được phân cấp vd như các vị trí trong 1 công ty)<br>
  Đọc thêm: [https://viblo.asia/p/composite-pattern](https://viblo.asia/p/composite-design-pattern-tro-thu-dac-luc-cua-developers-Qbq5QBk3KD8)<br>
  Đọc thêm: [https://viblo.asia/p/composite-pattern-2](https://viblo.asia/p/design-pattern-composite-pattern-6J3ZgXqPlmB)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/composite.png?raw=true" />
    <p align="center">Hình 8: Structure of Composite</p>
  </p>

-	*Decorator Pattern*: Được sử dụng để mở rộng chức năng mà không làm thay đổi cấu trúc của nó.<br>
  Đọc thêm: [https://viblo.asia/p/decorator-pattern](https://viblo.asia/p/decorator-design-pattern-tro-thu-dac-luc-cua-developers-1VgZvQ1OKAw)<br>
  Đọc thêm: [https://viblo.asia/p/decorator-pattern-2](https://viblo.asia/p/hieu-biet-co-ban-ve-decorator-pattern-pVYRPjbVG4ng)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/decorator.png?raw=true" />
    <p align="center">Hình 9: Structure of Decorator</p>
  </p>

-	*Facade Pattern*: Cung cấp một giao diện chung đơn giản thay cho một nhóm giao diện có trong một hệ thống con. Nó cho phép truy cập giao diện chung này để giao tiếp với các giao diện có trong hệ thống con.<br>
  Đọc thêm: [https://viblo.asia/p/facade-pattern](https://viblo.asia/p/facade-design-pattern-tro-thu-dac-luc-cua-developers-924lJBLNlPM)<br>
  Đọc thêm: [https://viblo.asia/p/facade-pattern-2](https://viblo.asia/p/design-patterns-facade-pattern-jvElaLVAZkw)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/facade.png?raw=true" />
    <p align="center">Hình 10: Structure of Facade</p>
  </p>

-	*Flyweight Pattern*: Tối ưu hóa RAM bằng cách chia sẻ các đối tượng. Đảm bảo sử dụng khi chương trình có vấn đề về tiêu thụ RAM (các thuộc tính không thay đổi (intrinsic) – các thuộc tính thay đổi (extrinsic)). Thông thường các thuộc tính intrinsic sẽ tốn dung lương hơn và nó thường không thay đổi giá trị (ps: như thế mới dùng flyweight).<br>
  Đọc thêm: [https://viblo.asia/p/flyweight-pattern](https://viblo.asia/p/flyweight-design-pattern-tro-thu-dac-luc-cua-developers-maGK7B4b5j2)<br>
  Đọc thêm: [https://viblo.asia/p/flyweight-pattern-2](https://viblo.asia/p/design-pattern-flyweight-3P0lP8vGlox)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/flyweight.png?raw=true" />
    <p align="center">Hình 11: Structure of Flyweight</p>
  </p>

-	*Proxy Pattern*: (Surrogate)Điều khiển gián tiếp truy xuất đối tượng thông qua một đối tượng được ủy nhiệm. Giải quyết các vấn đề security, performance, validation, …vv.<br>
  Đọc thêm: [https://viblo.asia/p/proxy-pattern](https://viblo.asia/p/proxy-design-pattern-tro-thu-dac-luc-cua-developers-RQqKLB2bl7z)<br>
  Đọc thêm: [https://viblo.asia/p/proxy-pattern-2](https://viblo.asia/p/tim-hieu-ve-proxy-pattern-va-ung-dung-yMnKMyQgK7P)
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/proxy.png?raw=true" />
    <p align="center">Hình 12: Structure of Proxy</p>
  </p>

## Nhóm Behavior:
-	*Chain of Responsibility*: gửi yêu cầu nhưng không biết đối tượng nào sẽ xử lý nó. Danh sách này giống danh sách liên kết với việc duyệt qua ccas phần tử. Yêu cầu được gửi sẽ đi qua các phần tử cho đến khi nào đó nó được xử lý.<br>
  Đọc thêm: [https://viblo.asia/p/chain-of-responsibility-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/chain-of-responsibility-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/chain-of-responsibility.png?raw=true" />
    <p align="center">Hình 13: Structure of “Chain of Responsibility”</p>
  </p>

-	*Command Pattern* (Action, Transaction): cho phép chuyển đổi request thành một object độc lập chứa tất cả thông tin về request. Nó sẽ cho phép tham số hóa các method như log, queue (undo/redo), transaction.<br>
  Đọc thêm: [https://viblo.asia/p/command-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/cammnd-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/command.png?raw=true" />
    <p align="center">Hình 14: Structure of Command</p>
  </p>

-	*Iterator Pattern* (Cursor): cho phép xử lý nhiều loại tập hợp khác nhau bằng cách truy cập những phần tử của tập hợp với cách thức, phương pháp định sẵn mà không cần phải hiểu rõ những chi tiết bên trong tập hợp.<br>
  Đọc thêm: [https://viblo.asia/p/iterator-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/iteraror-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/iterator.png?raw=true" />
    <p align="center">Hình 15: Structure of Iterator</p>
  </p>

-	*Mediator Pattern*: nó có nghĩa như người trung gian, tương tự như adapter pattern nhưng được sử dụng trong mục đích khác. Đối với adapter thì hai thành phần không thể giao tiếp với nhau nhưng đối với mediator thì có nhưng nó sẽ tạo ra sự hỗn loạn. Thay vì giao tiếp trực tiếp với nhau nó có thể giao tiếp với nhau thông qua mediator.<br>
  Đọc thêm: [https://viblo.asia/p/mediator-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/mediator-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/mediator.png?raw=true" />
    <p align="center">Hình 16: Structure of Mediator</p>
  </p>

-	*Memento Pattern*: Cho phép người dùng lưu trữ và hồi phục các phiên bản cũ của một object mà không cần can thiệp vào nội dung của object đó.<br>
  Đọc thêm: [https://viblo.asia/p/memento-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/memento-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/memento.png?raw=true" />
    <p align="center">Hình 17: Structure of Memento</p>
  </p>

-	*Observer Pattern*: Định nghĩa mối phụ thuộc một – nhiều giữa các đối tượng để khi mà một đối tượng có sự thay đổi trạng thái, tất các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động.<br>
  Đọc thêm: [https://viblo.asia/p/observer-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/observer-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/observer.png?raw=true" />
    <p align="center">Hình 18: Structure of Observer</p>
  </p>

-	*State Pattern*: là một mẫu thiết kế hành vi cho phép một object thay đổi hành vi của nó khi trạng thái bên trong của nó thay đổi.<br>
  Đọc thêm: [https://viblo.asia/p/state-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/state-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/state.png?raw=true" />
    <p align="center">Hình 19: Structure of State</p>
  </p>

-	*Stratery Pattern*: tách rời phần xử lý chức năng cụ thể ra khỏi đối tượng. Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và chọn thuật toán phù hợp để xử lý. Thông thường việc tách như vậy là do việc thay vì override hay copy - viết lại các method đó với 1 đối tượng tương tự ta có thể thay thế nó bằng việc gom nó lại và viết phương thức cho nó.<br>
  Đọc thêm: [https://viblo.asia/p/strategy-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/strategy-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/strategy.png?raw=true" />
    <p align="center">Hình 20: Structure of Strategy</p>
  </p>

-	*Template Pattern*: Xây dựng một bộ khung thuật toán trong một toán tử, để lại việc định nghĩa một vài bước cho một vài bước cho các subclass mà không làm thay đổi cấu trúc chung của thuật toán. Về cơ bản nếu như trong một class cha có các đối tượng với các đối tượng đó sử dụng chung một method nhưng method đó phải xử lý tùy biến với mỗi đối tượng ta có thể thay class cha là abstract và các đối tượng con kế thừa từ lớp cha. Về method xử lý tùy biết sẽ được viết lại trong các class con để sao cho với mỗi class con có thể xử lý đúng một phương thức.<br>
  Đọc thêm: [https://viblo.asia/p/template-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/template-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/template.png?raw=true" />
    <p align="center">Hình 21: Structure of Template</p>
  </p>

-	*Visitor Pattern*: Cho phép định nghĩa các operation trên một tập hợp các đối tượng không đồng nhất về kiểu mà không làm thay đổi định nghĩa về lớp của các đối tượng đó.<br>
  Đọc thêm: [https://viblo.asia/p/visitor-pattern]()<br>
  Đọc thêm: [https://viblo.asia/p/visitor-pattern-2]()
  <p align="center">
    <img src="https://github.com/kien091/design-pattern/blob/master/Image/visitor.png?raw=true" />
    <p align="center">Hình 22: Structure of Visitor</p>
  </p>
