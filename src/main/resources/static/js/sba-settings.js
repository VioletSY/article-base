/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//This is a Thymleaf template whill will be rendered by the backend
// eslint-disable-next-line no-unused-vars
var SBA = {
  uiSettings: {"title":"Spring Boot Admin","brand":"<img src=\"assets\/img\/icon-spring-boot-admin.svg\"><span>Spring Boot Admin<\/span>","loginIcon":"assets\/img\/icon-spring-boot-admin.svg","favicon":"assets\/img\/favicon.png","faviconDanger":"assets\/img\/favicon-danger.png","notificationFilterEnabled":false,"rememberMeEnabled":true,"routes":["\/about\/**","\/applications\/**","\/instances\/**","\/journal\/**","\/wallboard\/**","\/external\/**"],"externalViews":[]},
  user: {"name":"user"},
  extensions: [],
  csrf: {
    parameterName: "_csrf",
    headerName: "X-XSRF-TOKEN"
  },
  use: function (ext) {
    this.extensions.push(ext);
  }
};
