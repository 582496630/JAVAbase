/**
 * 
 */

function leave(){
	if(confirm("确定离开吗？")){
		self.close();
	}else{
		return flase;
	}
}

window.onload=intiAll;  //什么意思
function intiAll(){
	document.getElementsByTagName("form")[0].onsubmit=function (){
		return addNode();     //为什么这么写
	}
}

function addNode(){
	
	var intext = document.getElementById("textArea").value;//获取元素ID
	var newText=document.createTextNode(intext);//创建文本节点，并把文本加入进去
	var newGraf=document.createElement("p");//创建P元素
	newGraf.appendChild(newText);//把文本节点加入P中
	var fBody=document.getElementsByTagName("body")[0];//获取元素标签名
	fBody.appendChild(newGraf);//把含有文本内容的P标签放入body内
	return false;   // 此处不可以省略，起到抑制默认行为的作用
}

function delNode(){
	
	var getP=document.getElementsByTagName("p");
	
	if (getP.length>1){
	var lastP=getP.item(getP.length - 1)//获取最后一个P的内容
	var fBody=document.getElementsByTagName("body")[0];
	fBody.removeChild(lastP);
	//return false;
		
	}
	
}

function charu(){
	var inf=window.prompt();
	var newLi=document.createElement("li")
	var charuzhi = document.createTextNode(inf)
	newLi.appendChild(charuzhi)
	
	var list = document.getElementById("list")
	list.insertBefore(newLi,list.childNodes[5])

	return false
}	
	function tidai() {
		
		var inf=window.prompt("输入要替换的内容");
		
		var newLi=document.createElement("li")
		var tihuanzhi = document.createTextNode(inf)
		newLi.appendChild(tihuanzhi)
		
		
	    
		var list = document.getElementById("list");
		var ing=window.prompt("输入要替换第几个ul内的节点"+"(必须<"+list.childNodes.length+")");
		list.replaceChild(newLi,list.childNodes[ing])
		return false;
	}
	
	function tidai2() {
		
		var inf=window.prompt("输入要替换的内容");
		
		var newLi=document.createElement("li")
		var tihuanzhi = document.createTextNode(inf)
		newLi.appendChild(tihuanzhi)
		
		
	    
		var list = document.getElementById("list");
		var ing=window.prompt("输入要替换第几个li内的内容"+"(必须<"+list.children.length+")");
		list.replaceChild(newLi,list.children[ing])
		return false;
	}
	
	
	
	


