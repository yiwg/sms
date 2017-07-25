/**
 * Created by mengchen on 2015/10/20.
 */

;(function(KS, window) {
    "use strict";

    var $ = window.jQuery;

    KS.progressBar = function(id, initValue) {

        var value = parseInt(initValue) || 0;
        var barId = "bar-" + Date.now();
        $("#" + id).html("<div class='ks-progress-bar' id='" + barId + "'>\
                            <div class='finished-bar' style='width:" + initValue + "%'></div>\
                            <div class='percent-title'>" + value + "%</div>\
                        </div>");
        var $bar = $("#" + barId);

        return {
            setValue: function(val) {
                if (value < 0 || value > 100) return;
                value = val;
                $bar.find(".percent-title").text(value + "%");
                $bar.find(".finished-bar").animate({
                    width: value + "%"
                });
            },
            getValue: function() {
                return value;
            },
            destroy: function() {
            	$bar.parent().remove();
            }
        };
    };

    if (!window.KS) {
        window.KS = KS;
    }
})(window.KS || {}, window);