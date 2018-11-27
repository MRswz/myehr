// Variables



var animationDiv= document.getElementById('animationDiv');

var addButton= document.getElementById('add');


var editSVG= '<?xml version="1.0" encoding="utf-8"?><svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 1000 1000" style="enable-background:new 0 0 22 22;" xml:space="preserve"><g><g transform="matrix(1 0 0 -1 0 1920)"><path class="fill" d="M924.3,1664.1l-118.7,118.7l59.1,59.5c4.4,4.1,9.4,6.2,15.2,6.2s10.7-2.1,14.8-6.2l89.1-89.1c4.1-4.1,6.2-9.1,6.2-15c0-5.9-2.1-10.9-6.2-15L924.3,1664.1z M515,1254.8l-118.7,118.7L769.9,1747l118.7-118.7L515,1254.8z M174.2,991.6c-29.6,0-57,7.3-82.3,22c-25.3,14.6-45.3,34.6-59.9,59.7c-14.6,25.2-22,52.7-22,82.5v410.6c0,29.6,7.3,57,22,82.3c14.6,25.3,34.6,45.3,59.9,59.9c25.3,14.6,52.8,22,82.3,22h410.6c14.5,0,30.2-2.6,47.2-7.8l-74.3-74.3H133.2c-7.4,0-14.2-1.8-20.5-5.5c-6.3-3.7-11.3-8.7-15-15c-3.7-6.3-5.5-13.1-5.5-20.5v-492.7c0-11.2,4-20.9,12.1-28.9c8.1-8.1,17.7-12.1,28.9-12.1h492.7c11.2,0,20.9,4,28.9,12.1c8.1,8.1,12.1,17.7,12.1,28.9v178.2L749,1375v-219.2c0-29.8-7.3-57.3-22-82.5c-14.6-25.2-34.6-45.1-59.9-59.7c-25.3-14.6-52.8-22-82.3-22H174.2z M305.6,1152.1c-2.5-1.1-4.7-1.6-6.6-1.6c-4.4,0-6.6,2.3-6.6,7c0,1.9,0.4,4.1,1.2,6.6l66.9,171.2L475.2,1219L305.6,1152.1z"/></g></g></svg>';
var removeSVG= '<?xml version="1.0" encoding="utf-8"?><svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 22 22" style="enable-background:new 0 0 22 22;" xml:space="preserve"><g><g><path class="fill" d="M16.1,3.6h-1.9V3.3c0-1.3-1-2.3-2.3-2.3h-1.7C8.9,1,7.8,2,7.8,3.3v0.2H5.9c-1.3,0-2.3,1-2.3,2.3v1.3c0,0.5,0.4,0.9,0.9,1v10.5c0,1.3,1,2.3,2.3,2.3h8.5c1.3,0,2.3-1,2.3-2.3V8.2c0.5-0.1,0.9-0.5,0.9-1V5.9C18.4,4.6,17.4,3.6,16.1,3.6z M9.1,3.3c0-0.6,0.5-1.1,1.1-1.1h1.7c0.6,0,1.1,0.5,1.1,1.1v0.2H9.1V3.3z M16.3,18.7c0,0.6-0.5,1.1-1.1,1.1H6.7c-0.6,0-1.1-0.5-1.1-1.1V8.2h10.6L16.3,18.7L16.3,18.7z M17.2,7H4.8V5.9c0-0.6,0.5-1.1,1.1-1.1h10.2c0.6,0,1.1,0.5,1.1,1.1V7z"/></g><g><g><path class="fill" d="M11,18c-0.4,0-0.6-0.3-0.6-0.6v-6.8c0-0.4,0.3-0.6,0.6-0.6s0.6,0.3,0.6,0.6v6.8C11.6,17.7,11.4,18,11,18z"/></g><g><path class="fill" d="M8,18c-0.4,0-0.6-0.3-0.6-0.6v-6.8C7.4,10.2,7.7,10,8,10c0.4,0,0.6,0.3,0.6,0.6v6.8C8.7,17.7,8.4,18,8,18z"/></g><g><path class="fill" d="M14,18c-0.4,0-0.6-0.3-0.6-0.6v-6.8c0-0.4,0.3-0.6,0.6-0.6c0.4,0,0.6,0.3,0.6,0.6v6.8C14.6,17.7,14.3,18,14,18z"/></g></g></g></svg>';
var checkSVG = ' <?xml version="1.0" encoding="utf-8"?><svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 22 22" style="enable-background:new 0 0 22 22;" xml:space="preserve"><circle  cx=11 cy=11 class="noFill" stroke="rgb(47, 167, 77)" r="10" width="23" height="23"/><g><path class="fill" d="M9.7,14.4L9.7,14.4c-0.2,0-0.4-0.1-0.5-0.2l-2.7-2.7c-0.3-0.3-0.3-0.8,0-1.1s0.8-0.3,1.1,0l2.1,2.1l4.8-4.8c0.3-0.3,0.8-0.3,1.1,0s0.3,0.8,0,1.1l-5.3,5.3C10.1,14.3,9.9,14.4,9.7,14.4z"/></g></svg>';

var itemTextBox =document.getElementById('item')


completedList= document.getElementById('completed');
todoList = document.getElementById('todo');


// Core Functions

document.body.addEventListener('click',function(){
    itemTextBox.focus();
});

addButton.addEventListener('click', function(){
    addItem();
});

itemTextBox.addEventListener('keydown', KeyboardEvent => {
    if(KeyboardEvent.key=="Enter")
    {
        addItem();
    }
})





function addItem(){
    if(itemTextBox.value){
        newElement(itemTextBox.value);
        itemTextBox.value="";
        }
        
        document.getElementById('add').classList.toggle("rotate");
        addAnimation();
        
}


function fade(element){
    element.classList.remove('invisible');
    
}



function checkItem(){
    checkButton = this;
    checkAnimateDiv = this.children[1];
    console.log(checkAnimateDiv);
    checkElement = this.parentElement.parentElement;
	
	$.ajax({
		url:'sysTask/checkSysTask.action?sysTaskId='+checkElement.value,
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			queryTask1();
			queryToDoTask();
			queryFinishTask();
		}
	});
    

    if(!(checkElement.classList.contains('checked'))){
        checkElement.classList.add('checked');
        checkAnimation(checkAnimateDiv);
        
        //checkElement.classList.add('invisible');
        
        setTimeout(function() {
           completedList.appendChild(checkElement);
           
        }, 100);

        setTimeout(function() {
            DOMCleaner(checkAnimateDiv);
            
         }, 500);
    }
    else{
        checkElement.classList.remove('checked');
        deleteAnimation(checkElement);
        //todoList.prepend(checkElement);
       //todoList.prepend(item);
    todoList.insertBefore(checkElement, todoList.firstChild);

    }
    
    

}



function DOMCleaner(item){
    while (item.firstChild) {
        //item.removeChild(item.firstChild);
        item.firstChild.remove();
      }
}

function removeItem(){
    deleteElement = this.parentElement.parentElement;
	$.ajax({
		url:'sysTask/deleteSysTask.action?sysTaskId='+deleteElement.value,
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			queryTask1();
			queryToDoTask();
			queryFinishTask();
		}
	});
    deleteElement.classList.add('deleted');
    deleteAnimation(deleteElement);

    setTimeout(function() {
            deleteElement.remove();
    }, 500);
    
    
}

function editItem(){
	deleteElement = this.parentElement.parentElement;
	var url = '/myehr/jsp/task/addTask/editTask.jsp?sysTaskId='+deleteElement.value;
	layer.open({
		type: 2,
		title:'编辑任务',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['450px', '700px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
		}
	});
}



function newElement(value){
    
    
    var item = document.createElement('li');
    item.innerHTML=value;
    item.classList.add('invisible');
	
	recode = saveTask(value);
	item.value = recode;
    
    
    var buttonsDiv= document.createElement('div');
    buttonsDiv.classList.add('buttons');
    
    var editButton = document.createElement('button');
    editButton.classList.add('editButton');
    editButton.innerHTML= editSVG;

    editButton.addEventListener('click', editItem);

    var deleteButton = document.createElement('button');
    deleteButton.classList.add('deleteButton');
    deleteButton.innerHTML= removeSVG;

    deleteButton.addEventListener('click', removeItem);
    

    var checkButton = document.createElement('button');
    checkButton.classList.add('checkButton');
    checkButton.innerHTML= checkSVG;

    var checkAnimateDiv = document.createElement('div');
    checkAnimateDiv.id="checkAnimateDiv";
    checkButton.appendChild(checkAnimateDiv);

    checkButton.addEventListener('click',checkItem);
    
    buttonsDiv.appendChild(editButton);
    buttonsDiv.appendChild(deleteButton);
    buttonsDiv.appendChild(checkButton);
    
    item.appendChild(buttonsDiv);
    

    //todoList.prepend(item);
    todoList.insertBefore(item, todoList.firstChild);
    setTimeout(function() {
        fade(item);
    }, 100);
}

function newElement1(obj){
    
    var value = obj.sysTaskContent;
	var id = obj.sysTaskId;
    var item = document.createElement('li');
    item.innerHTML=value;
    item.classList.add('invisible');
	item.value = id;
	
    
    var buttonsDiv= document.createElement('div');
    buttonsDiv.classList.add('buttons');
    
    var editButton = document.createElement('button');
    editButton.classList.add('editButton');
    editButton.innerHTML= editSVG;

    editButton.addEventListener('click', editItem);

    var deleteButton = document.createElement('button');
    deleteButton.classList.add('deleteButton');
    deleteButton.innerHTML= removeSVG;

    deleteButton.addEventListener('click', removeItem);
    

    var checkButton = document.createElement('button');
    checkButton.classList.add('checkButton');
    checkButton.innerHTML= checkSVG;

    var checkAnimateDiv = document.createElement('div');
    checkAnimateDiv.id="checkAnimateDiv";
    checkButton.appendChild(checkAnimateDiv);

    checkButton.addEventListener('click',checkItem);
    
    buttonsDiv.appendChild(editButton);
    buttonsDiv.appendChild(deleteButton);
    buttonsDiv.appendChild(checkButton);
    
    item.appendChild(buttonsDiv);
    
	if(obj.sysTaskStatus=='1'){
		item.classList.add('checked');
		completedList.appendChild(item);
	}else{
		todoList.insertBefore(item, todoList.firstChild);
	}

    //todoList.prepend(item);
    
    setTimeout(function() {
        fade(item);
    }, 100);
}

function saveTask(value){
	$.ajax({
		url:'sysTask/saveSysTask.action?value='+value,
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			queryTask1();
			return text;
		}
	});
}

function queryTask(){
	$.ajax({
		url:'sysTask/querySysTask.action',
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				newElement1(text[i]);
			}
		}
	});
}



// Visual 



/* Add Button Animation */
function addAnimation(){
    const Burst1 = new mojs.Burst ({
        parent: animationDiv,
        top: '50%',
        left: '50%', 
        radius: {0: 80},
        count: 8,
        children: {
            shape: 'circle',
            fill: {'red':'blue'},
            strokeWidth: 1,
            duration: 600,
            stroke: {'red':'blue'}
        }
    });


    const Burst2 = new mojs.Burst ({
        parent: animationDiv,
        top: '50%',
        left: '50%', 
        radius: {0: 100},
        count: 4,
        children: {
            shape: 'rect',
            fill: 'white',
            strokeWidth: 1,
            duration: 300,
            stroke: 'white'
        }
    });



    const circle1= new mojs.Shape ({
        radius: {0:40},
        parent: animationDiv,
        fill: 'none',
        stroke: 'white',
        strokeWidth:15,
        duration: 300,
        opacity: {1: 0}
    });

    const circle2= new mojs.Shape ({
        radius: {0:50},
        parent: animationDiv,
        fill: 'none',
        stroke: 'red',
        strokeWidth:5,
        duration: 400,
        opacity: {1: 0}
    });


    const circle3= new mojs.Shape ({
        radius: {0:60},
        parent: animationDiv,
        fill: 'none',
        stroke: 'blue',
        strokeWidth:5,
        duration: 500,
        opacity: {1: 0}
    });

    const circle4= new mojs.Shape ({
        radius: {0:70},
        parent: animationDiv,
        fill: 'white',
        
        stroke: 'white',
        strokeWidth:5,
        duration: 600,
        opacity: {1: 0}
    });

    const timeline = new mojs.Timeline ({
        
        repeat: 0
    }).add(circle4,circle1,circle2,circle3,Burst1,Burst2);

    timeline.play();
}


/* Delete item animation */

function checkAnimation(checkItem){
    const circle1 = new mojs.Shape({
        radius: {0:1000},
        parent: checkItem,
        fill:'#7bef28',
        stroke: 'white',
        strokeWidth: 10,
        duration:500,
        opacity:{1:0}
    });

    const circle2 = new mojs.Shape({
        radius: {0:200},
        parent: checkItem,
        fill: 'none', 
        stroke: 'white',
        strokeWidth: 30,
        duration:300,
        opacity:{1.7:0}
    });

    const circle3 = new mojs.Shape({
        radius: {0:400},
        parent: checkItem,
        fill: 'none', 
        stroke: '#230e5780',
        strokeWidth: 10,
        duration:400,
        opacity:{1:0}
        
    });



    

    const timelineX = new mojs.Timeline ({
        repeat: 0,
        
    }).add(circle1,circle2,circle3);

    timelineX.play();
    
    
}


function deleteAnimation(deleteItem){
    /* LEFT SIDE */
    const swirlR1 = new mojs.ShapeSwirl({
    parent: deleteItem,
    top: '100%',
    left: '0%',
    fill:           'rgba(255,255,255,1)',
    y:              { 0: -100 },
    radius:         30,
    swirlSize:      5,
    swirlFrequency: 1, 
    duration:       500,
    direction:       -1,
    degreeShift: 90
    });
    const swirlR2 = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '0%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -85 },
        radius:         25,
        swirlSize:      5,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: 70
    });
    const swirlR3 = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '0%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -70 },
        radius:         20,
        swirlSize:      5,
        swirlFrequency: 1, 
        duration:       1000,
        direction:       -1,
        degreeShift: 50
    });

    const swirlL1 = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '0%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -100 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       1000,
        direction:       -1,
        degreeShift: -90
    });
    const swirlL2 = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '0%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -85 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: -10
    });
    const swirlL3 = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '0%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -70 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: -30
    });



    /* RIGHT SIDE */
    const swirlR1B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -100 },
        radius:         30,
        swirlSize:      5,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: -90
    });
    const swirlR2B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -85 },
        radius:         25,
        swirlSize:      5,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: -70
    });
    const swirlR3B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -70 },
        radius:         20,
        swirlSize:      5,
        swirlFrequency: 1, 
        duration:       1000,
        direction:       -1,
        degreeShift: -50
    });

    const swirlL1B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -100 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       1000,
        direction:       -1,
        degreeShift: 90
    });
    const swirlL2B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -85 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: 10
    });
    const swirlL3B = new mojs.ShapeSwirl({
        parent: deleteItem,
        top: '100%',
        left: '100%',
        fill:           'rgba(255,255,255,1)',
        y:              { 0: -70 },
        radius:         30,
        swirlSize:      30,
        swirlFrequency: 1, 
        duration:       500,
        direction:       -1,
        degreeShift: 30
    });

    const timeline = new mojs.Timeline;

    timeline.add(swirlR1,swirlR2,swirlR3,swirlL1,swirlL2,swirlL3,swirlR1B,swirlR2B,swirlR3B,swirlL1B,swirlL2B,swirlL3B);

    timeline.play();
}