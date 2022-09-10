


function notify() {
  // tạo thông báo khi clnk vào nút try it
  alert("Chào mừng bạn đến với ứng dụng JavaScript đầu tiên");

  // kiểm tra và gián giá trị cho nút bước tiếp theo
  var check = document.getElementById("mybtn");
  if (check.style.display == "none") {
    check.style.display = "block";
  } else {
    check.style.display = "none";
  }

  // form nhập liệu

  while (true) {
    let name = prompt("hãy nhập tên của bạn");

    if (name != "") {
      document.getElementById("name").innerHTML = 'Tên của bạn là : ' + name;
      break;
    } else {
      alert('làm ơn nhập tên của bạn')
    }
  }

  while (true) {
    let city = prompt("hãy nhập thành phố bạn đang sống");


    if (city != "") {
      document.getElementById("city").innerHTML = 'Hiện tại bạn đang sống tại : ' + city;
      break;
    } else {
      alert('làm ơn nhập thành phố bạn đang sống')
    }
  }
  while (true) {
    let mobile = prompt("hãy nhập số điện thoại  của bạn");

    if (mobile != "") {
      document.getElementById("mobile").innerHTML = 'Số điện thoại của bạn là : ' + mobile;
      break;
    } else {
      alert('làm ơn nhập số điện thoại  của bạn')
    }
  }

  //form năm sinh và tính tuổi
  var year = new Date;
  year = year.getFullYear();
  var namsinh = prompt("xin mời nhập năm sinh của bạn");
  namsinh = namsinh * 1;
  var tuoi;
  if (namsinh < year) {
    document.getElementById("age").innerHTML = 'Bạn sinh năm : ' + namsinh;
    tuoi = year - namsinh;
    document.getElementById("tuoi").innerHTML = 'Năm nay bạn được :' + tuoi + ' tuổi';
  } else {
    while (namsinh > year) {
      namsinh = prompt("xin mời nhập năm sinh của bạn");
      namsinh = namsinh * 1;
      if (namsinh < year) {
        document.getElementById("age").innerHTML = 'Bạn sinh năm : ' + namsinh;
        tuoi = year - namsinh;
        document.getElementById("tuoi").innerHTML = 'Năm nay bạn được :' + tuoi + ' tuổi';
      }
    }
  }

  while (true) {
    let email = prompt("hãy nhập Email của bạn");

    if (email != "") {
      document.getElementById("email").innerHTML = 'Email của bạn là : ' + email;
      break;
    } else {
      alert('làm ơn nhập Email của bạn')
    }
  }
  while (true) {
    let jobs = prompt("hãy nhập công việc hiện tại của bạn");

    if (jobs != "") {
      document.getElementById("jobs").innerHTML = 'Công việc hiện tại của bạn là : ' + jobs;
      break;
    } else {
      alert('làm ơn nhập công việc hiện tại của bạn')
    }
  }
}

