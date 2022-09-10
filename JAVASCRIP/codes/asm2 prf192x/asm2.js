var testScore = {
    name: "",
    math: 0,
    physic: 0,
    chemistry: 0,
}

function nhapDuLieu() {
    testScore.name = document.getElementById("Name").value;
    testScore.math = document.getElementById("math").value;
    testScore.physic = document.getElementById("physic").value;
    testScore.chemistry = document.getElementById("chemistry").value;

    var row = document.getElementById("mytable").insertRow();

    var STT = row.insertCell();
    var HovaTen = row.insertCell();
    var math = row.insertCell();
    var physic = row.insertCell();
    var chemistry = row.insertCell();
    var dtb = row.insertCell();

 STT.innerHTML = row.rowIndex;
 HovaTen.innerHTML = testScore.name;
 math.innerHTML = testScore.math;
 physic.innerHTML = testScore.physic;
 chemistry.innerHTML = testScore.chemistry;
 dtb.innerHTML = "?";

 document.getElementById("Name").value = "";
 document.getElementById("math").value = "";
 document.getElementById("physic").value = "";
 document.getElementById("chemistry").value = "";
}

// Tính điểm trung bình
function dtb() {
    var table = document.getElementById("mytable");

    for(let i = 1; i < table.rows.length; i++) {
        var row = table.rows[i]
        row.cells[5].innerHTML = parseInt(( parseFloat(row.cells[2].innerHTML) + parseFloat(row.cells[3].innerHTML) + parseFloat(row.cells[4].innerHTML) ) / 3);
    }
}

// Xác định học sinh giỏi
function hsg() {
    var table = document.getElementById("mytable");
    
    for(var j = 1; j < table.rows.length; j++){

    var x = parseInt(table.rows[j].cells[5].innerHTML);
    if(x >= 8) {
        table.rows[j].style.color = "red"
    }
    }
    
}