package com.example.tos.result;

/**
 *  自定义异常类
 */
public class TosException extends RuntimeException {

        private Integer code;

        public TosException(CodeEnum codeEnum) {
            super(codeEnum.getMsg());
            this.code = codeEnum.getCode();
        }

        public Integer getCode() {
            return code;
        }

        public String getMsg() {
            return super.getMessage();
        }
}
