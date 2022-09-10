// tạo biến bảng điểm 
var arrBangDiem = [];

// tạo hàm nhập dữ liệu
function nhap() {
    var name = document.getElementById('name').value;
    var math = document.getElementById('math').value;
    var physical = document.getElementById('physical').value;
    var chemistry = document.getElementById('chemistry').value;

    //tạo trường để nhận giá trị
    var testScore = {
        name: name,
        math: math,
        physical: physical,
        chemistry: chemistry,
    };
    // console.log(testScore)
    arrBangDiem.push(testScore)
    in_danhsach();
    resetForm()
}

// in danh sách ra bảng 
function in_danhsach() {
    var table = document.getElementById('table');

    // xóa dữ liệu trong Row
    for (var i = table.rows.length - 1; i > 0; i--) {
        table.deleteRow(i);
    }

    // duyet bảng điểm
    for (var i = 0; i < arrBangDiem.length; i++) {
        var obj = arrBangDiem[i];
        // tao 1 row mới
        var row = table.insertRow();
        // tạo cell mới cho row
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);
        // dưa giá trị vào các cell
        cell1.innerHTML = i + 1;
        cell2.innerHTML = obj.name;
        cell3.innerHTML = obj.math;
        cell4.innerHTML = obj.physical;
        cell5.innerHTML = obj.chemistry;
        cell6.innerHTML = "?";
    }

}
// tạo hàm reset form nhập vào 
function resetForm() {
    document.getElementById('name').value = '';
    document.getElementById('math').value = '';
    document.getElementById('physical').value = '';
    document.getElementById('chemistry').value = '';
}


// tạo hàm tính điểm trung bình
function tinh_dtb() {
    //lay bang
    var table = document.getElementById('table');

    // duyệt bảng
    for (var i = 1; i < table.rows.length; i++) {
        var row = table.rows[i]

        var dtb = (parseFloat(row.cells[2].innerHTML) + parseFloat(row.cells[3].innerHTML) + parseFloat(row.cells[4].innerHTML)) / 3

        row.cells[5].innerHTML = dtb.toFixed(2)

    }

}
// tạo hàm xác định học sinh giỏi
function XacDinhHsg() {
    //lay bang
    var table = document.getElementById('table');

    // duyệt bảng
    for (var i = 1; i < table.rows.length; i++) {
        var row = table.rows[i];
        if (parseFloat(row.cells[5].innerHTML) >= 8) {
            table.rows[i].style.color = "red";
        }
    }
}