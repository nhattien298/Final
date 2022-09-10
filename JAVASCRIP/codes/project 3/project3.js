  // tạo biến bảng điểm 
  var arrBangDiem=[];

  // tạo các biến 
  
  $(document).ready(function(){
  var rowCurrent;
    $('#btnNhap').click(function(){

      //validate
      if ($('#name').val()=='' || $('#math').val()==''|| $('#physical').val()=='' ||$('#chemistry').val()=='' || $('#math').val()> 10|| $('#physical').val() > 10 ||$('#chemistry').val() > 10){
        alert('xin nhập đầy đủ và chính xác thông tin')
      }else{
        var name = $('#name').val();
        var math = $('#math').val();
        var physical = $('#physical').val();
        var chemistry = $('#chemistry').val();

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
       
    });
    function in_danhsach(){
        // xóa dữ liệu trong Row
        
        $('tbody tr').each(function(){
          $(this).remove()});

          // duyet bảng điểm
        for (var i =0 ; i<arrBangDiem.length;i++){
            var obj = arrBangDiem[i];
            // tao 1 row mới
            $('#table tbody').append($('<tr>')
            .append($('<td>').append(i+1))
            .append($('<td>').append(obj.name))
            .append($('<td>').append(obj.math))
            .append($('<td>').append(obj.physical))
            .append($('<td>').append(obj.chemistry))
            .append($('<td>').append('?'))
            .append($('<td>')
            .append('<button class="suachua" >Sữa </button>')
            ))
        }
     // tạo hàm sửa chửa
  
  $('.suachua').on('click',function(){
    $('#btnCapnhat').show();
    rowCurrent = $(this).closest('tr');
    var name = rowCurrent.find('td:eq(1)').text();
    var math = rowCurrent.find('td:eq(2)').text();
    var physical = rowCurrent.find('td:eq(3)').text();
    var chemistry = rowCurrent.find('td:eq(4)').text();

    // đưa giá trị vào cái form
    $('#name').val(name);
    $('#math').val(math);
    $('#physical').val(physical);
    $('#chemistry').val(chemistry);

    });   
  }

  // tạo hàm cập nhật
  $('#btnCapnhat').click(function(){
    $(this).hide()
    var index = rowCurrent.find('td:eq(0)').text();
    
    // cap nhat bang diem
    arrBangDiem[index-1].name = $('#name').val();
    arrBangDiem[index-1].math = $('#math').val();
    arrBangDiem[index-1].physical = $('#physical').val();
    arrBangDiem[index-1].chemistry = $('#chemistry').val();
    in_danhsach();
    resetForm()
  })


    function resetForm(){
        $('#name').val("");
        $('#math').val("");
        $('#physical').val("");
        $('#chemistry').val("");
    }

    // tạo hàm tính điểm trung bình
  $('#dtb').click(function(){
    $('#table tbody').children('tr').each(function(){
      var math = parseFloat(($(this).children('td').eq(2).text()));
      var physical = parseFloat(($(this).children('td').eq(3).text()));
      var chemistry = parseFloat(($(this).children('td').eq(4).text()));
      var DTB = ((math + physical + chemistry)/3).toFixed(1);

       $(this).children('td:eq(5)').html(DTB)
      }); 
  });

  // tạo hàm xác định học sinh giỏi
  $('#hsg').click(function(){
    $('#table tbody').children('tr').each(function(){
      if (parseFloat(($(this).children('td').eq(5).text())) >= 8){
        $(this).addClass('red')
      };
    }); 
  });

  

});




