package com.acn.acit.watsonservices.conversation;

public class Xpath {
	private static String UserXML;
	private static String Tags;
	private static String Xpath;
	private static String Attribute;
	
	public static void setXML(String XML) {
		UserXML = XML;
		String strAlt  = " alt=";
		String strClass  = " class=";
		String strContextmenu  = " contextmenu=";
		String strForm  = " form=";
		String strHref  = " href=";
		String strID  = " id=";
		String strName  = " name=";
		String strTitle  = " title=";
		Attribute = "List of available attributes below: \n";
		
		if ( XML.toLowerCase().indexOf(strAlt.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Alt \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strClass.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Class \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strContextmenu.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Contextmenu \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strForm.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Form \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strHref.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Href \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strID.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Id \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strName.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Name \n";
			//create and call a method that will get the attribute value in the XML
		}
		if ( XML.toLowerCase().indexOf(strTitle.toLowerCase()) != -1 ) {
			Attribute = Attribute + "-Title \n";
			//create and call a method that will get the attribute value in the XML
		}
		System.out.println(Attribute);
	}

	public static void getXML() {
		System.out.println(Attribute);
	}
	
	public String GetXPath(){
		Xpath = this.getTag();
		
		return Xpath;
	}

	public String getTag(){
		String strAbbr = "<abbr";
		String strAddress = "<address";
		String strArea = "<area";
		String strArticle = "<article";
		String strAside = "<aside";
		String strAudio = "<audio";
		String strA = "<a";
		String strBase = "<base";
		String strBdi = "<bdi";
		String strBdo = "<bdo";
		String strBlockquote = "<blockquote";
		String strBody = "<body";
		String strBr = "<br";
		String strButton = "<button";
		String strB = "<b";
		String strCanvas = "<canvas";
		String strCaption = "<caption";
		String strCite = "<cite";
		String strCode = "<code";
		String strColgroup = "<colgroup";
		String strCol = "<col";
		String strDatalist = "<datalist";
		String strDd = "<dd";
		String strDel = "<del";
		String strDetails = "<details";
		String strDfn = "<dfn";
		String strDialog = "<dialog";
		String strDiv = "<div";
		String strDl = "<dl";
		String strDt = "<dt";
		String strEmbed = "<embed";
		String strEm = "<em";
		String strFieldset = "<fieldset";
		String strFigcaption = "<figcaption";
		String strFigure = "<figure";
		String strFooter = "<footer";
		String strForm = "<form";
		String strH1 = "<h1";
		String strH2 = "<h2";
		String strH3 = "<h3";
		String strH4 = "<h4";
		String strH5 = "<h5";
		String strH6 = "<h6";
		String strHeader = "<header";
		String strHead = "<head";
		String strHr = "<hr";
		String strHtml = "<html";
		String strIframe = "<iframe";
		String strImg = "<img";
		String strInput = "<input";
		String strIns = "<ins";
		String strI = "<i";
		String strKbd = "<kbd";
		String strLabel = "<label";
		String strLegend = "<legend";
		String strLink = "<link";
		String strLi = "<li";
		String strMain = "<main";
		String strMap = "<map";
		String strMark = "<mark";
		String strMenuitem = "<menuitem";
		String strMenu = "<menu";
		String strMeta = "<meta";
		String strMeter = "<meter";
		String strNav = "<nav";
		String strNoscript = "<noscript";
		String strObject = "<object";
		String strOl = "<ol";
		String strOptgroup = "<optgroup";
		String strOption = "<option";
		String strOutput = "<output";
		String strParam = "<param";
		String strPicture = "<picture";
		String strPre = "<pre";
		String strProgress = "<progress";
		String strP = "<p";
		String strQ = "<q";
		String strRp = "<rp";
		String strRt = "<rt";
		String strRuby = "<ruby";
		String strSamp = "<samp";
		String strScript = "<script";
		String strSection = "<section";
		String strSelect = "<select";
		String strSmall = "<small";
		String strSource = "<source";
		String strSpan = "<span";
		String strStrong = "<strong";
		String strStyle = "<style";
		String strSub = "<sub";
		String strSummary = "<summary";
		String strSup = "<sup";
		String strS = "<s";
		String strTable = "<table";
		String strTbody = "<tbody";
		String strTd = "<td";
		String strTemplate = "<template";
		String strTextarea = "<textarea";
		String strTfoot = "<tfoot";
		String strThead = "<thead";
		String strTh = "<th";
		String strTime = "<time";
		String strTitle = "<title";
		String strTrack = "<track";
		String strTr = "<tr";
		String strUl = "<ul";
		String strU = "<u";
		String strVar = "<var";
		String strVideo = "<video";
		String strWbr = "<wbr";
		
		if (UserXML.toLowerCase().indexOf(strAbbr.toLowerCase()) != -1 ) {
			Tags = "//abbr";
		}else if (UserXML.toLowerCase().indexOf(strAddress.toLowerCase()) != -1 ) {
			Tags = "//address";
		}else if (UserXML.toLowerCase().indexOf(strArea.toLowerCase()) != -1 ) {
			Tags = "//area";
		}else if (UserXML.toLowerCase().indexOf(strArticle.toLowerCase()) != -1 ) {
			Tags = "//article";
		}else if (UserXML.toLowerCase().indexOf(strAside.toLowerCase()) != -1 ) {
			Tags = "//aside";
		}else if (UserXML.toLowerCase().indexOf(strAudio.toLowerCase()) != -1 ) {
			Tags = "//audio";	
		}else if (UserXML.toLowerCase().indexOf(strA.toLowerCase()) != -1 ) {
			Tags = "//a";
		}else if (UserXML.toLowerCase().indexOf(strBase.toLowerCase()) != -1 ) {
			Tags = "//base";
		}else if (UserXML.toLowerCase().indexOf(strBdi.toLowerCase()) != -1 ) {
			Tags = "//bdi";
		}else if (UserXML.toLowerCase().indexOf(strBdo.toLowerCase()) != -1 ) {
			Tags = "//bdo";
		}else if (UserXML.toLowerCase().indexOf(strBlockquote.toLowerCase()) != -1 ) {
			Tags = "//blockquote";
		}else if (UserXML.toLowerCase().indexOf(strBody.toLowerCase()) != -1 ) {
			Tags = "//body";
		}else if (UserXML.toLowerCase().indexOf(strBr.toLowerCase()) != -1 ) {
			Tags = "//br";
		}else if (UserXML.toLowerCase().indexOf(strButton.toLowerCase()) != -1 ) {
			Tags = "//button";
		}else if (UserXML.toLowerCase().indexOf(strB.toLowerCase()) != -1 ) {
			Tags = "//b";
		}else if (UserXML.toLowerCase().indexOf(strCanvas.toLowerCase()) != -1 ) {
			Tags = "//canvas";
		}else if (UserXML.toLowerCase().indexOf(strCaption.toLowerCase()) != -1 ) {
			Tags = "//caption";	
		}else if (UserXML.toLowerCase().indexOf(strCite.toLowerCase()) != -1 ) {
			Tags = "//cite";	
		}else if (UserXML.toLowerCase().indexOf(strCode.toLowerCase()) != -1 ) {
			Tags = "//code";	
		}else if (UserXML.toLowerCase().indexOf(strColgroup.toLowerCase()) != -1 ) {
			Tags = "//colgroup";	
		}else if (UserXML.toLowerCase().indexOf(strCol.toLowerCase()) != -1 ) {
			Tags = "//col";
		}else if (UserXML.toLowerCase().indexOf(strDatalist.toLowerCase()) != -1 ) {
			Tags = "//datalist";
		}else if (UserXML.toLowerCase().indexOf(strDd.toLowerCase()) != -1 ) {
			Tags = "//dd";
		}else if (UserXML.toLowerCase().indexOf(strDel.toLowerCase()) != -1 ) {
			Tags = "//del";
		}else if (UserXML.toLowerCase().indexOf(strDetails.toLowerCase()) != -1 ) {
			Tags = "//details";
		}else if (UserXML.toLowerCase().indexOf(strDfn.toLowerCase()) != -1 ) {
			Tags = "//dfn";
		}else if (UserXML.toLowerCase().indexOf(strDialog.toLowerCase()) != -1 ) {
			Tags = "//dialog";
		}else if (UserXML.toLowerCase().indexOf(strDiv.toLowerCase()) != -1 ) {
			Tags = "//div";
		}else if (UserXML.toLowerCase().indexOf(strDl.toLowerCase()) != -1 ) {
			Tags = "//dl";
		}else if (UserXML.toLowerCase().indexOf(strDt.toLowerCase()) != -1 ) {
			Tags = "//dt";
		}else if (UserXML.toLowerCase().indexOf(strEmbed.toLowerCase()) != -1 ) {
			Tags = "//embed";
		}else if (UserXML.toLowerCase().indexOf(strEm.toLowerCase()) != -1 ) {
			Tags = "//em";
		}else if (UserXML.toLowerCase().indexOf(strFieldset.toLowerCase()) != -1 ) {
			Tags = "//fieldset";
		}else if (UserXML.toLowerCase().indexOf(strFigcaption.toLowerCase()) != -1 ) {
			Tags = "//figcaption";
		}else if (UserXML.toLowerCase().indexOf(strFigure.toLowerCase()) != -1 ) {
			Tags = "//figure";
		}else if (UserXML.toLowerCase().indexOf(strFooter.toLowerCase()) != -1 ) {
			Tags = "//footer";
		}else if (UserXML.toLowerCase().indexOf(strForm.toLowerCase()) != -1 ) {
			Tags = "//form";
		}else if (UserXML.toLowerCase().indexOf(strH1.toLowerCase()) != -1 ) {
			Tags = "//h1";
		}else if (UserXML.toLowerCase().indexOf(strH2.toLowerCase()) != -1 ) {
			Tags = "//h2";
		}else if (UserXML.toLowerCase().indexOf(strH3.toLowerCase()) != -1 ) {
			Tags = "//h3";
		}else if (UserXML.toLowerCase().indexOf(strH4.toLowerCase()) != -1 ) {
			Tags = "//h4";
		}else if (UserXML.toLowerCase().indexOf(strH5.toLowerCase()) != -1 ) {
			Tags = "//h5";
		}else if (UserXML.toLowerCase().indexOf(strH6.toLowerCase()) != -1 ) {
			Tags = "//h6";
		}else if (UserXML.toLowerCase().indexOf(strHeader.toLowerCase()) != -1 ) {
			Tags = "//header";
		}else if (UserXML.toLowerCase().indexOf(strHead.toLowerCase()) != -1 ) {
			Tags = "//head";
		}else if (UserXML.toLowerCase().indexOf(strHr.toLowerCase()) != -1 ) {
			Tags = "//hr";
		}else if (UserXML.toLowerCase().indexOf(strHtml.toLowerCase()) != -1 ) {
			Tags = "//html";
		}else if (UserXML.toLowerCase().indexOf(strIframe.toLowerCase()) != -1 ) {
			Tags = "//iframe";		
		}else if (UserXML.toLowerCase().indexOf(strImg.toLowerCase()) != -1 ) {
			Tags = "//img";	
		}else if (UserXML.toLowerCase().indexOf(strInput.toLowerCase()) != -1 ) {
			Tags = "//input";
		}else if (UserXML.toLowerCase().indexOf(strIns.toLowerCase()) != -1 ) {
			Tags = "//ins";
		}else if (UserXML.toLowerCase().indexOf(strI.toLowerCase()) != -1 ) {
			Tags = "//i";
		}else if (UserXML.toLowerCase().indexOf(strKbd.toLowerCase()) != -1 ) {
			Tags = "//kbd";
		}else if (UserXML.toLowerCase().indexOf(strLabel.toLowerCase()) != -1 ) {
			Tags = "//label";
		}else if (UserXML.toLowerCase().indexOf(strLegend.toLowerCase()) != -1 ) {
			Tags = "//legend";
		}else if (UserXML.toLowerCase().indexOf(strLink.toLowerCase()) != -1 ) {
			Tags = "//link";
		}else if (UserXML.toLowerCase().indexOf(strLi.toLowerCase()) != -1 ) {
			Tags = "//li";
		}else if (UserXML.toLowerCase().indexOf(strMain.toLowerCase()) != -1 ) {
			Tags = "//main";
		}else if (UserXML.toLowerCase().indexOf(strMap.toLowerCase()) != -1 ) {
			Tags = "//map";
		}else if (UserXML.toLowerCase().indexOf(strMark.toLowerCase()) != -1 ) {
			Tags = "//mark";
		}else if (UserXML.toLowerCase().indexOf(strMenuitem.toLowerCase()) != -1 ) {
			Tags = "//menuitem";
		}else if (UserXML.toLowerCase().indexOf(strMenu.toLowerCase()) != -1 ) {
			Tags = "//menu";
		}else if (UserXML.toLowerCase().indexOf(strMeta.toLowerCase()) != -1 ) {
			Tags = "//meta";
		}else if (UserXML.toLowerCase().indexOf(strMeter.toLowerCase()) != -1 ) {
			Tags = "//meter";
		}else if (UserXML.toLowerCase().indexOf(strNav.toLowerCase()) != -1 ) {
			Tags = "//nav";
		}else if (UserXML.toLowerCase().indexOf(strNoscript.toLowerCase()) != -1 ) {
			Tags = "//noscipt";
		}else if (UserXML.toLowerCase().indexOf(strObject.toLowerCase()) != -1 ) {
			Tags = "//object";
		}else if (UserXML.toLowerCase().indexOf(strOl.toLowerCase()) != -1 ) {
			Tags = "//ol";
		}else if (UserXML.toLowerCase().indexOf(strOptgroup.toLowerCase()) != -1 ) {
			Tags = "//optgroup";
		}else if (UserXML.toLowerCase().indexOf(strOption.toLowerCase()) != -1 ) {
			Tags = "//option";
		}else if (UserXML.toLowerCase().indexOf(strOutput.toLowerCase()) != -1 ) {
			Tags = "//output";
		}else if (UserXML.toLowerCase().indexOf(strOutput.toLowerCase()) != -1 ) {
			Tags = "//output";
		}else if (UserXML.toLowerCase().indexOf(strParam.toLowerCase()) != -1 ) {
			Tags = "//param";
		}else if (UserXML.toLowerCase().indexOf(strPicture.toLowerCase()) != -1 ) {
			Tags = "//picture";
		}else if (UserXML.toLowerCase().indexOf(strPre.toLowerCase()) != -1 ) {
			Tags = "//pre";
		}else if (UserXML.toLowerCase().indexOf(strProgress.toLowerCase()) != -1 ) {
			Tags = "//progress";
		}else if (UserXML.toLowerCase().indexOf(strP.toLowerCase()) != -1 ) {
			Tags = "//p";
		}else if (UserXML.toLowerCase().indexOf(strQ.toLowerCase()) != -1 ) {
			Tags = "//q";
		}else if (UserXML.toLowerCase().indexOf(strRp.toLowerCase()) != -1 ) {
			Tags = "//rp";
		}else if (UserXML.toLowerCase().indexOf(strRt.toLowerCase()) != -1 ) {
			Tags = "//rt";	
		}else if (UserXML.toLowerCase().indexOf(strRuby.toLowerCase()) != -1 ) {
			Tags = "//ruby";
		}else if (UserXML.toLowerCase().indexOf(strSamp.toLowerCase()) != -1 ) {
			Tags = "//samp";
		}else if (UserXML.toLowerCase().indexOf(strScript.toLowerCase()) != -1 ) {
			Tags = "//script";
		}else if (UserXML.toLowerCase().indexOf(strSection.toLowerCase()) != -1 ) {
			Tags = "//section";
		}else if (UserXML.toLowerCase().indexOf(strSelect.toLowerCase()) != -1 ) {
			Tags = "//select";
		}else if (UserXML.toLowerCase().indexOf(strSmall.toLowerCase()) != -1 ) {
			Tags = "//small";
		}else if (UserXML.toLowerCase().indexOf(strSource.toLowerCase()) != -1 ) {
			Tags = "//source";
		}else if (UserXML.toLowerCase().indexOf(strSpan.toLowerCase()) != -1 ) {
			Tags = "//span";
		}else if (UserXML.toLowerCase().indexOf(strStrong.toLowerCase()) != -1 ) {
			Tags = "//strong";
		}else if (UserXML.toLowerCase().indexOf(strStyle.toLowerCase()) != -1 ) {
			Tags = "//style";
		}else if (UserXML.toLowerCase().indexOf(strSub.toLowerCase()) != -1 ) {
			Tags = "//sub";
		}else if (UserXML.toLowerCase().indexOf(strSummary.toLowerCase()) != -1 ) {
			Tags = "//summary";
		}else if (UserXML.toLowerCase().indexOf(strSup.toLowerCase()) != -1 ) {
			Tags = "//sup";
		}else if (UserXML.toLowerCase().indexOf(strS.toLowerCase()) != -1 ) {
			Tags = "//s";
		}else if (UserXML.toLowerCase().indexOf(strTable.toLowerCase()) != -1 ) {
			Tags = "//table";
		}else if (UserXML.toLowerCase().indexOf(strTbody.toLowerCase()) != -1 ) {
			Tags = "//td";
		}else if (UserXML.toLowerCase().indexOf(strTd.toLowerCase()) != -1 ) {
			Tags = "//table";
		}else if (UserXML.toLowerCase().indexOf(strTemplate.toLowerCase()) != -1 ) {
			Tags = "//template";
		}else if (UserXML.toLowerCase().indexOf(strTextarea.toLowerCase()) != -1 ) {
			Tags = "//textarea";
		}else if (UserXML.toLowerCase().indexOf(strTfoot.toLowerCase()) != -1 ) {
			Tags = "//tfoot";
		}else if (UserXML.toLowerCase().indexOf(strThead.toLowerCase()) != -1 ) {
			Tags = "//thead";
		}else if (UserXML.toLowerCase().indexOf(strTh.toLowerCase()) != -1 ) {
			Tags = "//th";
		}else if (UserXML.toLowerCase().indexOf(strTime.toLowerCase()) != -1 ) {
			Tags = "//time";
		}else if (UserXML.toLowerCase().indexOf(strTitle.toLowerCase()) != -1 ) {
			Tags = "//title";
		}else if (UserXML.toLowerCase().indexOf(strTrack.toLowerCase()) != -1 ) {
			Tags = "//track";
		}else if (UserXML.toLowerCase().indexOf(strTr.toLowerCase()) != -1 ) {
			Tags = "//tr";
		}else if (UserXML.toLowerCase().indexOf(strUl.toLowerCase()) != -1 ) {
			Tags = "//ul";
		}else if (UserXML.toLowerCase().indexOf(strU.toLowerCase()) != -1 ) {
			Tags = "//u";
		}else if (UserXML.toLowerCase().indexOf(strVar.toLowerCase()) != -1 ) {
			Tags = "//var";
		}else if (UserXML.toLowerCase().indexOf(strVideo.toLowerCase()) != -1 ) {
			Tags = "//video";
		}else if (UserXML.toLowerCase().indexOf(strWbr.toLowerCase()) != -1 ) {
			Tags = "//wbr";
		}
		
		return Tags;
	}
	
}
