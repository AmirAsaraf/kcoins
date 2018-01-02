package com.kcoins.services;

/**
 * Created by asaraf on 25/11/2016.
 */
public class MailTemplate {

    public static final String TEMPLATE_FROM_IDENTIFYER = "{{from}}";
    public static final String TEMPLATE_MESSAGE_IDENTIFYER = "{{message}}";
    public static final String TEMPLATE_COINS_IDENTIFYER = "{{coins}}";

    public static String MAIL_TEMPLATE = "\n" +
            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\n" +
            "    <!--[if gte mso 9]><xml>\n" +
            "     <o:OfficeDocumentSettings>\n" +
            "      <o:AllowPNG/>\n" +
            "      <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
            "     </o:OfficeDocumentSettings>\n" +
            "    </xml><![endif]-->\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
            "    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
            "    <title></title>\n" +
            "    <!--[if !mso]><!-- -->\n" +
            "\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n" +
            "\t<!--<![endif]-->\n" +
            "    \n" +
            "    <style type=\"text/css\" id=\"media-query\">\n" +
            "      body {\n" +
            "  margin: 0;\n" +
            "  padding: 0; }\n" +
            "\n" +
            "table, tr, td {\n" +
            "  vertical-align: top;\n" +
            "  border-collapse: collapse; }\n" +
            "\n" +
            ".ie-browser table, .mso-container table {\n" +
            "  table-layout: fixed; }\n" +
            "\n" +
            "* {\n" +
            "  line-height: inherit; }\n" +
            "\n" +
            "a[x-apple-data-detectors=true] {\n" +
            "  color: inherit !important;\n" +
            "  text-decoration: none !important; }\n" +
            "\n" +
            "[owa] .img-container div, [owa] .img-container button {\n" +
            "  display: block !important; }\n" +
            "\n" +
            "[owa] .fullwidth button {\n" +
            "  width: 100% !important; }\n" +
            "\n" +
            "[owa] .block-grid .col {\n" +
            "  display: table-cell;\n" +
            "  float: none !important;\n" +
            "  vertical-align: top; }\n" +
            "\n" +
            ".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\n" +
            "  width: 500px !important; }\n" +
            "\n" +
            ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\n" +
            "  line-height: 100%; }\n" +
            "\n" +
            ".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\n" +
            "  width: 164px !important; }\n" +
            "\n" +
            ".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\n" +
            "  width: 328px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\n" +
            "  width: 250px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\n" +
            "  width: 166px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\n" +
            "  width: 125px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\n" +
            "  width: 100px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\n" +
            "  width: 83px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\n" +
            "  width: 71px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\n" +
            "  width: 62px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\n" +
            "  width: 55px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\n" +
            "  width: 50px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\n" +
            "  width: 45px !important; }\n" +
            "\n" +
            ".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\n" +
            "  width: 41px !important; }\n" +
            "\n" +
            "@media only screen and (min-width: 520px) {\n" +
            "  .block-grid {\n" +
            "    width: 500px !important; }\n" +
            "  .block-grid .col {\n" +
            "    vertical-align: top; }\n" +
            "    .block-grid .col.num12 {\n" +
            "      width: 500px !important; }\n" +
            "  .block-grid.mixed-two-up .col.num4 {\n" +
            "    width: 164px !important; }\n" +
            "  .block-grid.mixed-two-up .col.num8 {\n" +
            "    width: 328px !important; }\n" +
            "  .block-grid.two-up .col {\n" +
            "    width: 250px !important; }\n" +
            "  .block-grid.three-up .col {\n" +
            "    width: 166px !important; }\n" +
            "  .block-grid.four-up .col {\n" +
            "    width: 125px !important; }\n" +
            "  .block-grid.five-up .col {\n" +
            "    width: 100px !important; }\n" +
            "  .block-grid.six-up .col {\n" +
            "    width: 83px !important; }\n" +
            "  .block-grid.seven-up .col {\n" +
            "    width: 71px !important; }\n" +
            "  .block-grid.eight-up .col {\n" +
            "    width: 62px !important; }\n" +
            "  .block-grid.nine-up .col {\n" +
            "    width: 55px !important; }\n" +
            "  .block-grid.ten-up .col {\n" +
            "    width: 50px !important; }\n" +
            "  .block-grid.eleven-up .col {\n" +
            "    width: 45px !important; }\n" +
            "  .block-grid.twelve-up .col {\n" +
            "    width: 41px !important; } }\n" +
            "\n" +
            "@media (max-width: 520px) {\n" +
            "  .block-grid, .col {\n" +
            "    min-width: 320px !important;\n" +
            "    max-width: 100% !important;\n" +
            "    display: block !important; }\n" +
            "  .block-grid {\n" +
            "    width: calc(100% - 40px) !important; }\n" +
            "  .col {\n" +
            "    width: 100% !important; }\n" +
            "    .col > div {\n" +
            "      margin: 0 auto; }\n" +
            "  img.fullwidth, img.fullwidthOnMobile {\n" +
            "    max-width: 100% !important; }\n" +
            "  .no-stack .col {\n" +
            "    min-width: 0 !important;\n" +
            "    display: table-cell !important; }\n" +
            "  .no-stack.two-up .col {\n" +
            "    width: 50% !important; }\n" +
            "  .no-stack.mixed-two-up .col.num4 {\n" +
            "    width: 33% !important; }\n" +
            "  .no-stack.mixed-two-up .col.num8 {\n" +
            "    width: 66% !important; }\n" +
            "  .no-stack.three-up .col.num4 {\n" +
            "    width: 33% !important; }\n" +
            "  .no-stack.four-up .col.num3 {\n" +
            "    width: 25% !important; } }\n" +
            "\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #FFFFFF\">\n" +
            "  <style type=\"text/css\" id=\"media-query-bodytag\">\n" +
            "    @media (max-width: 520px) {\n" +
            "      .block-grid {\n" +
            "        min-width: 320px!important;\n" +
            "        max-width: 100%!important;\n" +
            "        width: 100%!important;\n" +
            "        display: block!important;\n" +
            "      }\n" +
            "\n" +
            "      .col {\n" +
            "        min-width: 320px!important;\n" +
            "        max-width: 100%!important;\n" +
            "        width: 100%!important;\n" +
            "        display: block!important;\n" +
            "      }\n" +
            "\n" +
            "        .col > div {\n" +
            "          margin: 0 auto;\n" +
            "        }\n" +
            "\n" +
            "      img.fullwidth {\n" +
            "        max-width: 100%!important;\n" +
            "      }\n" +
            "\t\t\timg.fullwidthOnMobile {\n" +
            "        max-width: 100%!important;\n" +
            "      }\n" +
            "      .no-stack .col {\n" +
            "\t\t\t\tmin-width: 0!important;\n" +
            "\t\t\t\tdisplay: table-cell!important;\n" +
            "\t\t\t}\n" +
            "\t\t\t.no-stack.two-up .col {\n" +
            "\t\t\t\twidth: 50%!important;\n" +
            "\t\t\t}\n" +
            "\t\t\t.no-stack.mixed-two-up .col.num4 {\n" +
            "\t\t\t\twidth: 33%!important;\n" +
            "\t\t\t}\n" +
            "\t\t\t.no-stack.mixed-two-up .col.num8 {\n" +
            "\t\t\t\twidth: 66%!important;\n" +
            "\t\t\t}\n" +
            "\t\t\t.no-stack.three-up .col.num4 {\n" +
            "\t\t\t\twidth: 33%!important\n" +
            "\t\t\t}\n" +
            "\t\t\t.no-stack.four-up .col.num3 {\n" +
            "\t\t\t\twidth: 25%!important\n" +
            "\t\t\t}\n" +
            "    }\n" +
            "  </style>\n" +
            "  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\n" +
            "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
            "  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #FFFFFF;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "\t<tbody>\n" +
            "\t<tr style=\"vertical-align: top\">\n" +
            "\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
            "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #FFFFFF;\"><![endif]-->\n" +
            "\n" +
            "    <div style=\"background-color:transparent;\">\n" +
            "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 500px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
            "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
            "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 500px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
            "\n" +
            "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"500\" style=\" width:500px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
            "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 500px;display: table-cell;vertical-align: top;\">\n" +
            "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
            "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
            "\n" +
            "                  \n" +
            "                    <div align=\"center\" class=\"img-container center  autowidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
            "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 0px; padding-left: 0px;\" align=\"center\"><![endif]-->\n" +
            "<div style=\"line-height:25px;font-size:1px\">&#160;</div>  <img class=\"center  autowidth \" align=\"center\" border=\"0\" src=\"https://ci4.googleusercontent.com/proxy/_fe046sxVPJRyYXEVaSzpYFyre9KvlSl7X_oGgIhXrzrUHih3GOpjVALOpAwaCAj_XMPrRDNNp0ll-0I4PGz_crVW2iZkSF0ZgXnN5NFp01PLiTKkJ6B6N8k1Zz9mazkhaLtuzPKPk1nuiA_GP8=s0-d-e1-ft#https://pro-bee-template-catalog-public.s3.amazonaws.com/templates/default/37/symbol.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 64px\" width=\"64\">\n" +
            "<!--[if mso]></td></tr></table><![endif]-->\n" +
            "</div>\n" +
            "\n" +
            "                  \n" +
            "                  \n" +
            "                    <div align=\"center\" class=\"img-container center  autowidth  fullwidth\" style=\"padding-right: 30px;  padding-left: 30px;\">\n" +
            "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px;\" align=\"center\"><![endif]-->\n" +
            "<div style=\"line-height:30px;font-size:1px\">&#160;</div>  <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://ci6.googleusercontent.com/proxy/iRrHl8wTEW-H9AE1RKJ7iv349Q1PtIB8ejKszX5Fsn6UO79XrkHEZ3nsXvo8GhdcN14HmLV0q0jh_-hSFtiF8RcpS7r4i7MwKvsT9FMscGLQqroHX0QKUeQpchTr7mZ4TXfHZWdfH8wHUcgpW9g=s0-d-e1-ft#https://pro-bee-template-catalog-public.s3.amazonaws.com/templates/default/37/thanks.jpg\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 440px\" width=\"440\">\n" +
            "<div style=\"line-height:30px;font-size:1px\">&#160;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
            "</div>\n" +
            "\n" +
            "                  \n" +
            "                  \n" +
            "                    <div align=\"center\" class=\"img-container center  autowidth  fullwidth\" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
            "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 0px; padding-left: 0px;\" align=\"center\"><![endif]-->\n" +
            "  <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://ci5.googleusercontent.com/proxy/qtK29mExLOy2C-s1e74b3m98t-ok0QLS5vf6zuTldITiuIemVy7Vc4R0Z_Z9CBN_BfGmHESBKG7CpAix7zaHceju4pTXOsNlmUTxZaxgK-Yl-XEEzpHGu05Y1n7ESjP4FXOnrADLBY1fG8O2-6TvCvYdad4wNrJ2=s0-d-e1-ft#https://pro-bee-template-catalog-public.s3.amazonaws.com/templates/default/37/gift-gifanimated.gif\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 500px\" width=\"500\">\n" +
            "<!--[if mso]></td></tr></table><![endif]-->\n" +
            "</div>\n" +
            "\n" +
            "                  \n" +
            "                  \n" +
            "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px; padding-top: 30px; padding-bottom: 15px;\"><![endif]-->\n" +
            "<div style=\"font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;line-height:120%;color:#555555; padding-right: 30px; padding-left: 30px; padding-top: 30px; padding-bottom: 15px;\">\t\n" +
            "\t<div style=\"font-family:Montserrat, 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;font-size:12px;line-height:14px;color:#555555;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><span style=\"font-size: 18px; line-height: 21px;\"><strong>You have been rewarded by {{from}}</strong></span></p></div>\t\n" +
            "</div>\n" +
            "<!--[if mso]></td></tr></table><![endif]-->\n" +
            "\n" +
            "                  \n" +
            "                  \n" +
            "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 0px; padding-left: 0px; padding-top: 0px; padding-bottom: 5px;\"><![endif]-->\n" +
            "<div style=\"font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;line-height:120%;color:#5ACEE1; padding-right: 0px; padding-left: 0px; padding-top: 0px; padding-bottom: 5px;\">\t\n" +
            "\t<div style=\"font-size:12px;line-height:14px;color:#5ACEE1;font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><span style=\"font-size: 18px; line-height: 21px;\"><strong><span style=\"line-height: 21px; font-size: 18px;\">{{message}}</span></strong></span></p></div>\t\n" +
            "</div>\n" +
            "<!--[if mso]></td></tr></table><![endif]-->\n" +
            "\n" +
            "                  \n" +
            "                  \n" +
            "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 15px;\"><![endif]-->\n" +
            "<div style=\"font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;line-height:120%;color:#555555; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 15px;\">\t\n" +
            "\t<div style=\"font-family:Montserrat, 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;font-size:12px;line-height:14px;color:#555555;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><span style=\"font-size: 18px; line-height: 21px;\"><strong>You also got {{coins}} KCoins :)</strong></span></p></div>\t\n" +
            "</div>\n" +
            "<!--[if mso]></td></tr></table><![endif]-->\n" +
            "\n" +
            "                  \n" +
            "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
            "              </div>\n" +
            "            </div>\n" +
            "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>    <div style=\"background-color:#5ACEE1;\">\n" +
            "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 500px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
            "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
            "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#5ACEE1;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 500px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
            "\n" +
            "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"500\" style=\" width:500px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
            "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 500px;display: table-cell;vertical-align: top;\">\n" +
            "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
            "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
            "\n" +
            "                  \n" +
            "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
            "    <tbody>\n" +
            "        <tr style=\"vertical-align: top\">\n" +
            "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 0px;padding-left: 0px;padding-top: 0px;padding-bottom: 0px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
            "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
            "                    <tbody>\n" +
            "                        <tr style=\"vertical-align: top\">\n" +
            "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
            "                                <span></span>\n" +
            "                            </td>\n" +
            "                        </tr>\n" +
            "                    </tbody>\n" +
            "                </table>\n" +
            "            </td>\n" +
            "        </tr>\n" +
            "    </tbody>\n" +
            "</table>\n" +
            "                  \n" +
            "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
            "              </div>\n" +
            "            </div>\n" +
            "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>    <div style=\"background-color:#CCD7D9;\">\n" +
            "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 500px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #CCD7D9;\" class=\"block-grid \">\n" +
            "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#CCD7D9;\">\n" +
            "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#CCD7D9;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 500px;\"><tr class=\"layout-full-width\" style=\"background-color:#CCD7D9;\"><![endif]-->\n" +
            "\n" +
            "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"500\" style=\" width:500px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid #5ACEE1; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
            "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 500px;display: table-cell;vertical-align: top;\">\n" +
            "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
            "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid #5ACEE1; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
            "\n" +
            "                  \n" +
            "                    \n" +
            "<div align=\"center\" class=\"button-container center\" style=\"padding-right: 10px; padding-left: 10px; padding-top:10px; padding-bottom:10px;\">\n" +
            "  <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-spacing: 0; border-collapse: collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top:10px; padding-bottom:10px;\" align=\"center\"><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"\" style=\"height:31pt; v-text-anchor:middle; width:73pt;\" arcsize=\"10%\" strokecolor=\"#3AAEE0\" fillcolor=\"#3AAEE0\"><w:anchorlock/><v:textbox inset=\"0,0,0,0\"><center style=\"color:#ffffff; font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif; font-size:16px;\"><![endif]-->\n" +
            "    <div style=\"color: #ffffff; background-color: #3AAEE0; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 98px; width: 58px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 5px; padding-right: 20px; padding-bottom: 5px; padding-left: 20px; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align: center; mso-border-alt: none;\">\n" +
            "      <span style=\"font-size:16px;line-height:32px;\">Go to KCoins System</span>\n" +
            "    </div>\n" +
            "  <!--[if mso]></center></v:textbox></v:roundrect></td></tr></table><![endif]-->\n" +
            "</div>\n" +
            "\n" +
            "                  \n" +
            "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
            "              </div>\n" +
            "            </div>\n" +
            "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>   <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
            "\t\t</td>\n" +
            "  </tr>\n" +
            "  </tbody>\n" +
            "  </table>\n" +
            "  <!--[if (mso)|(IE)]></div><![endif]-->\n" +
            "\n" +
            "\n" +
            "</body></html>";
}