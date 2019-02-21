/*
 * Copyright (c) 2019. Prashant Kumar Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package guru.learningjournal.kafka.examples.common;

/**
 * Application Config
 *
 * @author prashant
 * @author www.learningjournal.guru
 */

public class AppConfigs {
    public final static String applicationID = "AdCampaignsDemo";
    public final static String bootstrapServers = "localhost:9092,localhost:9093";
    public final static String impressionTopic = "ad-impressions";
    public final static String clicksTopic = "ad-clicks";
    public final static String outputTopic = "campaign-performance";
    public final static String stateStoreName = "logs/state-store";
    public final static String stateStoreNameUT = "logs-ut/state-store";
}