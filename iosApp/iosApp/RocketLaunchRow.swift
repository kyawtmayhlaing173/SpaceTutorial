//
//  RocketLaunchRow.swift
//  iosApp
//
//  Created by Kyawt May Hlaing on 22/04/2025.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI
import Shared

struct RocketLaunchRow: View {
    var rocketLaunch: RocketLaunch
    
    var body: some View {
        HStack() {
            VStack(alignment: .leading, spacing: 10.0) {
                Text("\(rocketLaunch.missionName) - \(rocketLaunch.launchYear)")
                    .font(.system(size: 18))
                    .bold()
                Text(launchText)
                    .foregroundColor(launchColor)
                    .font(.system(size: 14))
                Text("\(rocketLaunch.details ?? "")")
            }
        }
    }
}

extension RocketLaunchRow {
    private var launchText: String {
        if let isSuccess = rocketLaunch.launchSuccess {
            return isSuccess.boolValue ? "Success" : "Failed"
        } else {
            return "No data"
        }
    }
    
    private var launchColor: Color {
        if let isSuccess = rocketLaunch.launchSuccess {
            return isSuccess.boolValue ? Color.green : Color.red
        } else {
            return Color.gray
        }
    }
}

#Preview {
    EmptyView()
}
