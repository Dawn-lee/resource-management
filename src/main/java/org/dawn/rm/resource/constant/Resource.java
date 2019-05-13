package org.dawn.rm.resource.constant;

public class Resource {

    public enum 文件类型{
        磁盘("0", "磁盘类型", " "),
        文件夹("1", "文件夹", " ");

        private String code;
        private String type;
        private String suffix;

        文件类型(String code, String type, String suffix){
            this.code = code;
            this.type = type;
            this.suffix = suffix;
        }

        public String getCode() {
            return code;
        }
        public String getType() {
            return type;
        }
        public String getSuffix() {
            return suffix;
        }
    }

    public enum 文件图标{
        磁盘("glyphicon glyphicon-hdd", ""),
        文件夹("glyphicon glyphicon-folder-open", "");

        private String icon;
        private String suffix;

        文件图标(String icon, String suffix){
            this.icon = icon;
            this.suffix = suffix;
        }

        public String getIcon() {
            return icon;
        }
        public String getSuffix() {
            return suffix;
        }
    }
}
