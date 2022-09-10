var arrnhanven=[];
var selectedIndex =-1;
function nhapvao(){
    //lay cac gia tri trong phong
    var ten= document.getElementById('ten').value;
    var phong =document.getElementById('phongban').value;
    var hsl=document.getElementById('hsl').value;

    if (validateForm()){

        var objnhanvien = {
            name : ten,
            phong : phong,
            hsl : hsl,
        }
        // console.log(objnhanvien)
        arrnhanven.push(objnhanvien);
        console.log("ds : ", arrnhanven);
        // xoa form
        //reset form
        resetForm()
        

        // in danh sach nhan vien
        in_danhsachnv();
    }
}
function in_danhsachnv(){
    var table = document.getElementById("myTable");
    // xoa du lieu trong row
    for (var i = table.rows.length - 1; i>0;i -- ){
        table.deleteRow(i);
    }
    // duyet danh sach nhan vien trong mang
    for (var i = 0; i< arrnhanven.length; i++){
        // console.log(arrnhanven[i]);
        var obj= arrnhanven[i];
        // tao ra 1 row moi
        var row = table.insertRow();
        // tao cell moi cho row
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        var cell5 = row.insertCell(4);
        var cell6 = row.insertCell(5);

        // dua du lieu vao cac cell
        cell1.innerHTML = i+1;
        cell2.innerHTML = obj.name;
        cell3.innerHTML = obj.phong;
        cell4.innerHTML = obj.hsl;
        cell5.innerHTML = "?";
        cell6.innerHTML = '<a href="#" onclick="onEdit(this)"><i class="fa fa-pencil-square-o"></i></a> <a href = "#" onclick="onDel(this)" ><i class="fa fa-remove"></i></a>';

    }
}
function onEdit(el){
    // console.log(el);
    // lay gia tr trong seleted row va dua len form
    var selectedRow = el.parentElement.parentElement;
    var ten = selectedRow.cells[1].innerText;
    var phong = selectedRow.cells[2].innerText;
    var hsl = selectedRow.cells[3].innerText;
    // gan gia tri len form
    document.getElementById('ten').value = ten;
    document.getElementById('phongban').value = phong;
    document.getElementById('hsl').value = hsl;
    // cap nhat selectedIndex
    selectedIndex=parseInt(selectedRow.cells[0].innerText)-1

    //hien thi nut cap nhat
    document.getElementById('capnhat').style.display = 'block';
    document.getElementById('nhap').style.display = 'none';

}
function capnhat(){
    arrnhanven[selectedIndex].name = document.getElementById('ten').value;
    arrnhanven[selectedIndex].phongban = document.getElementById('phongban').value;
    arrnhanven[selectedIndex].hsl = document.getElementById('hsl').value;

    in_danhsachnv();
    resetForm();
    // an nut cap nhat
    document.getElementById('capnhat').style.display = 'none';
    document.getElementById('nhap').style.display = 'block';
}
function onDel(el){
    // console.log(el);
    var selectedRow = el.parentElement.parentElement;
    selectedIndex=parseInt(selectedRow.cells[0].innerText)-1;
    if(confirm('ban co muon xoa du lieu nhan vien nay khong?')){
        arrnhanven.splice(selectedIndex,1);
        in_danhsachnv();
    }
}
function resetForm(){
    document.getElementById('ten').value = '';
    document.getElementById('phongban').value = '';
    document.getElementById('hsl').value = '';
}
function tinhluong(){
    //lay luong co ban 
    var lcb = parseFloat(document.getElementById('lcb').innerText);
    // console.log(lcb);

    // lay bang
    var table=document.getElementById('myTable');
    for (var i = 1; i< table.rows.length; i++){
        table.rows[i].cells[4].innerText = parseFloat(table.rows[i].cells[3].innerText) * lcb;
    }
}

function validateForm(){
    var result = true;
    var ten= document.getElementById('ten').value;
    if (ten ==''){
        document.getElementById('name_err').innerHTML ="ban chua nhap ten";
        result = false;
    }else{
        document.getElementById('name_err').innerHTML ="";
    }

    var phongban =document.getElementById('phongban').value;
    if (phongban ==''){
        document.getElementById('phongban_err').innerHTML ="ban chua chon phong";
        result = false;

    }else {
        document.getElementById('phongban_err').innerHTML ="";
    }


    var hsl=document.getElementById('hsl').value;
    // truong hop rong
    if (hsl ==''){
        document.getElementById('hsl_err1').innerHTML='ban chua nhap he so luong';
        result = false;

    }else {
        document.getElementById('hsl_err1').innerHTML=""
    }
    // truong hop la co chu 
    if (isNaN(hsl)){
        document.getElementById('hsl_err2').innerHTML='he so luong phai la so';
        result = false;

    }else {
        document.getElementById('hsl_err2').innerHTML="";
    }
    return result;
}