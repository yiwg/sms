/**
 * Created by 飞 on 2015/3/31.
 */
/**
 * Created by mengchen on 2015/3/30.
 */
(function($) {
    "use strict";

    if (!$) {
        throw new ReferenceError("please import jQuery First.");
    }

    var regexObj = {
            email: /^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/g,
            mobile:/^\d{11}$/
        };

    var ajaxValidate = function(url, param) {
        var result = false;
        $.ajax({
            url : url,
            dataType : "json",
            async : false,
            data : param,
            success : function(data) {
                result = !data.result;
            }
        });
        return result;
    };
    
    // 获取提示显示位置 
    function getTipElement(location,element){
    	if(location == "next"){
    		return $(element).next();
    	}
    		return $(element).parent().next();
    }
    function showErrorLocation(element,location,errorMessage){
        $(element).removeClass("success").addClass("danger");
        var tipElement = getTipElement(location,element);
        tipElement.hide();
    	tipElement.html("<img src='" + (window.APP && APP.ctx) + "/app/images/warning.png'/><span class='ks-red' style='font-size: 12px; padding-left: 3px;'>" +
        errorMessage + "</span>").show();
    }

    function showSuccessLocation(element,location){
        $(element).addClass("success");
        var tipElement = getTipElement(location,element);
        tipElement.html("<img src='" + (window.APP && APP.ctx) + "/app/images/ok.png'/><span class='ks-green' style='font-size: 12px; padding-left: 3px;'>成功</span>").show();
    }
    
    function getResult(validateObj,initPara,str){
    	if( str in validateObj ){
    		return validateObj[str];
    	}else if(!(str in validateObj) && (str in initPara)){
    		return initPara[str];
    	}
    	return null;
    }

    $.fn.extend({
    	initValidate: function(initPara) {
            var $validateForm = this;
            var $elements = $validateForm.find("input[validate]");
            var validateFuncs = [];
            var errorMessage = "";

            if( typeof(initPara) == "undefined"){
            	initPara = {};
            }else{
            	var initHideTipOnSuccess = initPara.hideTipOnSuccess;
            	var initTipLocation = initPara.tipLocation;
            }

            $elements.each(function (index, element) {
                var validateObj = eval("({" + $(element).attr("validate") + "})");
                var validateFunc = function () {

                    var result = false;
                    var ajaxParam = {};
                    if (validateObj.ajax) {
                        ajaxParam[validateObj.ajax.paramName] = $(element).val();
                    }
                    var ajaxValidateResult = true;
                    var equalToResult = false;
                    var location = "parent";

                    var str = "tipLocation";
                    location = getResult(validateObj, initPara, str);

                    if ((validateObj.required || $(element).val()) && (
                        (validateObj.required && !$(element).val())
                        || (validateObj.type && !(new RegExp(regexObj[validateObj.type]).test($(element).val())))
                        || (validateObj.regex && !(new RegExp(validateObj.regex).test($(element).val())))
                        || validateObj.equalTo && (equalToResult = (validateObj.equalTo && $(element).val() != $("#" + validateObj.equalTo.id).val()))
                        || validateObj.ajax && !(ajaxValidateResult = ajaxValidate(validateObj.ajax.url, ajaxParam))
                        )) {

                    	//获取错误信息
                        if(equalToResult){	
                        	errorMessage = validateObj.equalTo.errorMessage;
                        }else if(!ajaxValidateResult){
                            errorMessage = validateObj.ajax.errorMessage;
                        }else{
                            errorMessage = $(element).attr("placeholder");
                        }
                        showErrorLocation(element, location, errorMessage);
                        //显示错误提示
                    } else {
                    	$(element).removeClass("danger")
                    	var tipElement = getTipElement(location,element);
                    	tipElement.hide();
                    	var str = "hideTipOnSuccess";
                    	var flag = getResult(validateObj,initPara,str); 
                    	if(!flag){
                    		//显示正确提示
                    		showSuccessLocation(element,location);
                    	}
                    	result = true;
                    }
                    return result;
                };

                validateFuncs[index] = validateFunc;
                $(element).bind("blur", validateFunc);
            });
            this.data("validateFuncs", validateFuncs);
            this.data("elementsCount", $elements.length);
        }
    });
    $.fn.extend({
        doValidate: function(){
            var validateFuncs = this.data("validateFuncs");
            var elementCount = this.data("elementsCount");
            var passedElementCount = 0;
            for (var i = 0; i < validateFuncs.length; i++) {
                if (validateFuncs[i]()) {
                    passedElementCount++;
                }
            }
            return passedElementCount == elementCount;
        }
    })

})(window.jQuery);